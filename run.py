from pyswip import *
import os
import webview

def main():
  prolog = Prolog()
  prolog.consult("src/main.pl")
  webview.create_window("It works, Jim!", "http://www.flowrl.com")
  os.system("pause")

if __name__ == "__main__":
  main()
