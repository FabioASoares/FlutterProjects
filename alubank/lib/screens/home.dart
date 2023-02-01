import 'package:alubank/components/box_card.dart';
import 'package:alubank/components/color_dot.dart';
import 'package:alubank/components/sections/account_actions.dart';
import 'package:alubank/components/sections/account_points.dart';
import 'package:alubank/components/sections/header.dart';
import 'package:alubank/components/sections/recent_activity.dart';
import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import '../components/content_division.dart';
import '../themes/theme_colors.dart';

class Home extends StatelessWidget {
  const Home({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
      return Scaffold(body: Column(
        children: <Widget>[
          Header(),
          RecentAcitivy(),
          AccountAction(),
          AccountPoints()
        ],
      ),
    );
  }
}
