import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import '../box_card.dart';

class AccountAction extends StatelessWidget {
  const AccountAction({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Padding(
        padding: const EdgeInsets.all(20),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Padding(
              padding: const EdgeInsets.only(bottom: 20.0),
              child: Text(
                'Ações da conta',
                style: Theme.of(context).textTheme.titleMedium,
              ),
            ),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                InkWell(
                  onTap: (){},
                  child: const BoxCard(
                    boxContent: _AccountActionsContent(
                      icon: Icon(Icons.account_balance_wallet),
                      text: 'Depositar',
                    ),
                  ),
                ),
                InkWell(
                onTap: (){},
                  child: const BoxCard(
                    boxContent: _AccountActionsContent(
                      icon: Icon(Icons.cached),
                      text: 'Transferir',
                    ),
                  ),
                ),
                InkWell(
                  onTap: (){},
                  child: const BoxCard(
                    boxContent: _AccountActionsContent(
                      icon: Icon(Icons.payment),
                      text: ' Pagar ',
                    ),
                  ),
                ),
                InkWell(
                  onTap: (){},
                  child: const BoxCard(
                    boxContent: _AccountActionsContent(
                      icon: Icon(Icons.pix),
                      text: ' Pix ',
                    ),
                  ),
                ),
              ],
            )
          ],
        ));
  }
}

class _AccountActionsContent extends StatelessWidget {
  final Icon icon;
  final String text;

  const _AccountActionsContent(
      {Key? key, required this.icon, required this.text})
      : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: 75,
      child: Column(
        children:[
          Padding(
            padding: const EdgeInsets.only(bottom: 10.0),
            child: icon,
          ),
          Text(text),
        ]
      ),
    );
  }
}
