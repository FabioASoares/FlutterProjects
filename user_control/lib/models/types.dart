import 'package:client_control/models/client_type.dart';
import 'package:flutter/material.dart';

class Type extends ChangeNotifier{

  List<ClientType> types;

  Types({
    required this.type
  });

  void add(ClientType type){
    types.add(type);
    notifyListeners();
  }

}

