import 'package:estilizacao_componentes/components/box_card.dart';
import 'package:estilizacao_componentes/data/bank_http.mocks.dart';
import 'package:estilizacao_componentes/data/bank_inherited.dart';
import 'package:estilizacao_componentes/screens/home.dart';
import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:mockito/mockito.dart';

void main(){
  final MockBankHttp mock = MockBankHttp();
  testWidgets('Looking for "Spent" textfield', (tester)async{
    when(mock.dolarToReal()).thenAnswer((_)async => ('5'));
    await tester.pumpWidget(MaterialApp(home: BankInherited(child: Home(api: mock.dolarToReal()))));
    final spentFinder = find.text('Spent');
    expect(spentFinder, findsOneWidget);
  });
  testWidgets('Looking for a linearPrograssBar', (tester)async{
    when(mock.dolarToReal()).thenAnswer((_)async => ('5'));
    await tester.pumpWidget(MaterialApp(home: BankInherited(child: Home(api: mock.dolarToReal()))));
    //Procura pelo tipo 'find.byType' o tipo de widget esperado (LinearProgressIndicator)
    expect(find.byType(LinearProgressIndicator), findsOneWidget);
  });
  testWidgets('Looking for a AccountStatus', (tester)async{
    when(mock.dolarToReal()).thenAnswer((_)async => ('5'));
    await tester.pumpWidget(MaterialApp(home: BankInherited(child: Home(api: mock.dolarToReal()))));
    //Procura pelo tipo 'find.byType' o tipo de widget esperado (LinearProgressIndicator)
    expect(find.byKey(Key('testKey')), findsOneWidget);
  });
  testWidgets('Find 5 BoxCards', (tester)async{
    when(mock.dolarToReal()).thenAnswer((_)async => ('5'));
    await tester.pumpWidget(MaterialApp(home: BankInherited(child: Home(api: mock.dolarToReal()))));
    expect(find.byWidgetPredicate((widget) {
      if (widget is BoxCard) {
        return true;
      }
      else {
        return false;
      }
    }), findsNWidgets(5));
  });
  testWidgets('When tap deposit should upload earned in 10', (tester)async{
    when(mock.dolarToReal()).thenAnswer((_)async => ('5'));
    await tester.pumpWidget(MaterialApp(home: BankInherited(child: Home(api: mock.dolarToReal()),),));
    //Aperta o campo "Deposit"
    await tester.tap(find.text('Deposit'));
    //Aperta o campo "Earned"
    await tester.tap(find.text('Earned'));
    //Espera todas as microtransações finalizarem
    await tester.pumpAndSettle();
    //Executa o find procurando pelo campo de R$10.0 pela tela toda
    expect(find.text('\$10.0'), findsOneWidget);
  });
  testWidgets('testando essa bagaça', (tester)async{
    when(mock.dolarToReal()).thenAnswer((_)async => ('5'));
    await tester.pumpWidget(MaterialApp(home: BankInherited(child: Home(api: mock.dolarToReal()),),));
    verify(mock.dolarToReal()).called(6);
  });
}