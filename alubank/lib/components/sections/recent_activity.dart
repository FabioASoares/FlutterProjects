import 'package:alubank/components/content_division.dart';
import 'package:alubank/themes/theme_colors.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import '../box_card.dart';
import '../color_dot.dart';

class RecentAcitivy extends StatelessWidget {
  const RecentAcitivy({Key? key}) : super(key: key);


  @override
  Widget build(BuildContext context) {
    return Padding(padding: const EdgeInsets.all(16),
    child: BoxCard(boxContent: _RecentActivityContent()));
  }
}
class _RecentActivityContent extends StatelessWidget {
  const _RecentActivityContent({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
      Row(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        children: [// ROW - Valor de Saída
        Row(children: [
          Padding(
            padding: const EdgeInsets.only(right: 4.0),
            child: ColorDot(color: ThemeColors.recentActivity['spent']),
          ),
          Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
            Text('Saída'),
            Text('\$9.900,97', style: Theme.of(context).textTheme.bodyLarge,)
          ],)
        ],),
        Row(children: [ // ROW - Valor de Entrada
          Padding(
            padding: const EdgeInsets.only(right: 4.0),
            child: ColorDot(color: ThemeColors.recentActivity['income']),
          ),
          Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Text('Entrada'),
              Text('\$9.900,97', style: Theme.of(context).textTheme.bodyLarge,)
            ],)
        ],),
      ],),
      Padding(
        padding: const EdgeInsets.only(top: 16.0, bottom: 8.0),
        child: Text('Limite de Gastos: \$423,20'),
      ),
        Container(
          clipBehavior: Clip.hardEdge,
          decoration: BoxDecoration(borderRadius: BorderRadius.circular(5)),
          child: LinearProgressIndicator(

            value: 0.3,
            minHeight: 8.0,
          ),
        ),
        Padding(
          padding: const EdgeInsets.only(top: 8.0, bottom: 8.0),
          child: ContentDivision(),
        ),
        Text('Este mês você gastou \$1500,00 com jogos. Tente diminuir esses gastos'),
        TextButton(onPressed: (){}, child: Text('Diga-me como!', style: TextStyle(fontSize: 16),))
    ],);
  }
}

