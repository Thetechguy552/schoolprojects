   M S B A M L   `   `   `  ����N  JLab6a2Thegameclient, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null9!clr-namespace:Lab6a2ThegameclientLab6a2Thegameclient  5   	   !    Lab6a2Thegameclient.Options   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   3local!clr-namespace:Lab6a2Thegameclient     5   	     � Title$  Options��5   	   $	��345��6   $	��434��6&    � 
ResizeMode$ NoResize=�62   .��5	      �  � RowDefinitions 5
   
   �� 5      $��58 �6   �� 5      $��20 �6   �� 5      �� 5      $��42 �6   .+�5   
   �� $��0��6   ���#C40D42.+�5      ��  �� Right$ 10��6   
 �� Top$ 13��6&   $��Options��66   ���	#FFF7EFEF$��Times New Roman)�6_   $��24(�6|   $
��Bold"�6�   5      �� 5   
   $��1��6   
���   �5      �� 5   
   $��3��6    �� Orientation$ 
Horizontal=�6"   $��RightToLeft=�6;   �� 5   
   -   5        $��cancelButton��5   P   $��_Cancel��6   $��22��6#   $��75��6/   $��325,10,28,10q�6:   $��3��6d   �� 5   
   -   5        $��okButton��5   M   $	��_OK��6   $��22��6   $��75��6+   $��229,10,124,10q�66   $��3��6]   �� 5   
   $��2��6    �� Left$ 10��6&   $ 2��67   $	��408��6F   $	��208��6R   $��1��6_   .@�5      �� $
��Game��6   .��5      � ���	#FFE5E5E5.+�5      �� -   5        $��playAgainstComputerCheck��5   �   $��Play against computer��6   $
��Left=�6?   $��	11,33,0,0q�6Z   $	��Top=�6m   6�   �� 5      $��Number of players��6   $
��Left=�68   $��	10,54,0,0q�6S   $	��Top=�6f   �� 5      -   5        $��numberOfPlayersComboBox��5   q   $
��Left=�6   $��
196,58,0,0q�6:   $	��Top=�6N   $��86��6f    �� SelectedIndex$ 0��6�   .@�5      �� .��6'   26*   �� 5      .��6'   36*   �� 5       .��6'   46*    />5!      5"      5#      �� 5$      $��Computer Player��6   .��5%      � ���	#FFE5E5E5.+�5&      �� $��Skill Level��6   $
��Left=�62   $��	10,10,0,0q�6M   $	��Top=�6`   	� 5'      -   5        $��dumbAIRadioButton��5'   �   $
��Dumb��6"   $
��Left=�61   $��	37,41,0,0q�6L   $	��Top=�6_    d� 	IsChecked$
 TrueY�6w   6�   	� 5(      -   5        $��goodAIRadioButton��5(   w   $
��Good��6"   $
��Left=�61   $��	37,62,0,0q�6L   $	��Top=�6_   6w   	� 5)      -   5        $��cheatingAIRadioButton��5)   y   $��Cheats��6"   $
��Left=�63   $��	37,83,0,0q�6N   $	��Top=�6a   6y   5*      5+      5,      5-      5.      