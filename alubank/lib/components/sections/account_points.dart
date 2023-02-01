import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import '../../themes/theme_colors.dart';
import '../box_card.dart';
import '../color_dot.dart';
import '../content_division.dart';

class AccountPoints extends StatelessWidget {
  const AccountPoints({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(16),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Padding(
              padding: const EdgeInsets.only(bottom: 16.0),
              child: Text(
                'Pontos da Conta',
                style: Theme.of(context).textTheme.titleMedium,
              ),
          ),
          BoxCard(boxContent: _AccountPointsContent()),
        ],
      ),
    );
  }
}
class _AccountPointsContent extends StatelessWidget {
  const _AccountPointsContent({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        Padding(
            padding: const EdgeInsets.only(bottom: 8.0),
            child: Text('Pontos Totais: '),
        ),
        Text('3000', style: Theme.of(context).textTheme.bodyLarge,),
        Padding(
          padding: const EdgeInsets.only(top: 8.0, bottom: 8.0),
          child: ContentDivision(),
        ),
        Padding(
          padding: const EdgeInsets.all(4.0),
          child: Text('Objetivos:', style: Theme.of(context).textTheme.titleLarge,),
        ),
        Row(
          children: [
            Padding(
              padding: const EdgeInsets.only(right: 4.0),
              child: ColorDot(color: ThemeColors.recentActivity['delivery'])
            ),
            Padding(
              padding: const EdgeInsets.all(4.0),
              child: Text('Entrega gratis: 15000pts'),
            )
          ],
        ),
        Row(
          children: [
            Padding(
                padding: const EdgeInsets.only(right: 4.0),
                child: ColorDot(color: ThemeColors.recentActivity['straming'])
            ),
            Padding(
              padding: const EdgeInsets.all(4.0),
              child: Text('1 mês de streaming: 30000pts'),
            )
          ],
        ),
      ],
    );
  }
}

