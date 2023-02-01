import 'dart:html';

import 'package:flutter/cupertino.dart';

class Clients extends ChangeNotifier{
  List<Client> clients;

  Clients({
   required this.clients

  });
  void add(Client client){
    clients.add(client);
    notifyListeners;
  }
}