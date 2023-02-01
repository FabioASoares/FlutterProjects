import 'package:flutter/material.dart';
import 'package:purple_bank/screens/home.dart';

void main(){
  runApp(const Purple_Bank());
}

class Purple_Bank extends StatelessWidget {
  const Purple_Bank({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'PurpleBank',
      home: Home(),
    );
  }
}



