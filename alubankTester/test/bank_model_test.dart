import 'package:estilizacao_componentes/models/bank.dart';
import 'package:flutter_test/flutter_test.dart';


void main(){
  //Funções obrigatórias no metodo de teste: Local, Método, Resultado
  group('deposit single tests', () {
    test('Bank_model deposit should be equals to bank.points', (){
      final bank = BankModel();
      bank.deposit(10);
      expect(bank.points, 10); //Expect verifica se o valor passado foi inserido
    });
    test('Bank_model deposit should be available into 10', (){
      final bank = BankModel();
      bank.deposit(10);
      expect(bank.available, 10);
    });
  });

  test('Bank_model transfer shoulb be 10', (){
    final bank = BankModel();
    bank.transfer(10);
    expect(bank.points, 10);
  });

}