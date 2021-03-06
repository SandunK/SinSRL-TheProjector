 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . t o o l s . c r a w l e r ;  
  
 i m p o r t   j a v a . i o . B u f f e r e d R e a d e r ;  
 i m p o r t   j a v a . i o . B u f f e r e d W r i t e r ;  
 i m p o r t   j a v a . i o . F i l e I n p u t S t r e a m ;  
 i m p o r t   j a v a . i o . F i l e W r i t e r ;  
 i m p o r t   j a v a . i o . I n p u t S t r e a m R e a d e r ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . C a l e n d a r ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   o r g . a p a c h e . l o g 4 j . P r o p e r t y C o n f i g u r a t o r ;  
  
 i m p o r t   e d u . u c i . i c s . c r a w l e r 4 j . c r a w l e r . C r a w l C o n f i g ;  
 i m p o r t   e d u . u c i . i c s . c r a w l e r 4 j . c r a w l e r . C r a w l C o n t r o l l e r ;  
 i m p o r t   e d u . u c i . i c s . c r a w l e r 4 j . f e t c h e r . P a g e F e t c h e r ;  
 i m p o r t   e d u . u c i . i c s . c r a w l e r 4 j . r o b o t s t x t . R o b o t s t x t C o n f i g ;  
 i m p o r t   e d u . u c i . i c s . c r a w l e r 4 j . r o b o t s t x t . R o b o t s t x t S e r v e r ;  
  
 p u b l i c   c l a s s   H B S i n h a l a C r a w l e r   {  
 	  
 	 p u b l i c   s t a t i c   f i n a l   i n t   M O D E _ C R A W L _ O N L Y 	 	 =   0 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   M O D E _ C O L L E C T 	 	 =   1 ;  
 	 p u b l i c   s t a t i c   f i n a l   i n t   M O D E _ B A T C H _ C O L L E C T 	 =   2 ;  
 	 	  
 	 p u b l i c   s t a t i c   S t r i n g   s _ A p p P a t h   	 	 	 =   " " ;  
 	 p u b l i c   s t a t i c   S t r i n g   s _ T e m p P a t h   	 	 =   " " ;  
 	 p u b l i c   s t a t i c   S t r i n g   s _ I n p u t F i l e   	 	 =   " D : \ \ t m p \ \ s i n h a l a _ c r a w l e r \ \ i n 2 . t x t " ;  
 	 p u b l i c   s t a t i c   S t r i n g   s _ C o m F i l e   	 	 	 =   " s i n h a l a _ c r a w l e r . i n " ;  
 	 p u b l i c   s t a t i c   S t r i n g   s _ C r a w l H i s t o r y F i l e   =   " c r a w l _ h i s t o r y . t x t " ;  
 	 p u b l i c   s t a t i c   S t r i n g   s _ O u t F i l e   	 	 	 =   " o u t . t x t " ;  
 	 	  
 	 p u b l i c   s t a t i c   S t r i n g [ ]   a s _ C o l l e c t o r T y p e s   =   { " w o r d " } ;  
 	  
 	 p r i v a t e   s t a t i c   L i s t < S t r i n g >   l i s t _ B a s e U R L s 	 =   n e w   A r r a y L i s t < S t r i n g > ( ) ;  
 	  
 	 p u b l i c   s t a t i c   i n t 	 i _ P a g e s P e r R u n   =   1 0 0 ;  
  
 	 p u b l i c   s t a t i c   H B T e x t S t o r a g e   	 o _ S t o r a g e   =   n e w   H B T e x t S t o r a g e ( ) ;  
 	 p u b l i c   s t a t i c   H B T e x t E x t r a c t o r   	 o _ E x t r a c t o r   =   n u l l ; 	  
 	 p u b l i c   s t a t i c   C r a w l C o n t r o l l e r   	 o _ C o n t r o l l e r   =   n u l l ; 	  
  
 	 p r i v a t e   s t a t i c   P r i n t W r i t e r 	 	 o _ O u t F i l e   =   n u l l ;  
 	  
 	 p u b l i c   s t a t i c   i n t   i _ M o d e 	 =   M O D E _ C O L L E C T ;  
 	  
 	 p u b l i c   H B S i n h a l a C r a w l e r ( )    
 	 {  
 	  
 	 }  
  
 	  
 	 p u b l i c   s t a t i c   v o i d   S t a r t C r a w l e r ( )  
 	 {  
 	 	 H B C r a w l H i s t o r y . L o a d ( s _ C r a w l H i s t o r y F i l e ) ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   C r a w l   H i s t o r y   L o a d e d   :   "   +   H B C r a w l H i s t o r y . G e t E n t r y C o u n t ( ) ) ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   S t a r t i n g   C r a w l e r   T h r e a d s   . . .   " ) ;  
 	 	  
 	 	 S t a r t C r a w l e r T h r e a d s ( ) ;  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   C r a w l e r   T h r e a d s   S t o p e d .   " ) ;  
 	 	  
 	 	 / / T O D O  
 	 	 / / F l u s h   O u t p u t   F i l e s  
 	 	 o _ O u t F i l e . f l u s h ( ) ;  
 	 	 o _ O u t F i l e . c l o s e ( ) ; 	 	  
 	 }  
 	  
 	  
 	 p u b l i c   s t a t i c   v o i d   L o a d U R L L i s t ( S t r i n g   s F i l e N a m e )  
 	 {  
 	 	 t r y {  
 	 	 	 B u f f e r e d R e a d e r   i n   =   n e w   B u f f e r e d R e a d e r ( n e w   I n p u t S t r e a m R e a d e r ( n e w   F i l e I n p u t S t r e a m ( s F i l e N a m e ) ) ) ;  
 	 	 	  
 	 	 	 S t r i n g   s L i n e   =   i n . r e a d L i n e ( ) ;  
 	 	 	 w h i l e ( s L i n e ! = n u l l )  
 	 	 	 {  
 	 	 	 	 i f ( s L i n e . l e n g t h ( ) > 5 )  
 	 	 	 	 { 	 	 	 	 	  
 	 	 	 	 	 l i s t _ B a s e U R L s . a d d ( s L i n e ) ;  
 	 	 	 	 }  
 	 	 	 	 s L i n e   =   i n . r e a d L i n e ( ) ;  
 	 	 	 }  
 	 	 	 i n . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 }  
 	  
 	 p u b l i c   s t a t i c   b o o l e a n   A d d T o O u t p u t F i l e ( S t r i n g   s L i n e )  
 	 {  
 	 	 i f ( o _ O u t F i l e   = =   n u l l )  
 	 	 { 	 	 	  
 	 	 	 t r y  
 	 	 	 {  
 	 	 	 	 o _ O u t F i l e   =   n e w   P r i n t W r i t e r ( n e w   B u f f e r e d W r i t e r ( n e w   F i l e W r i t e r ( H B S i n h a l a C r a w l e r . s _ O u t F i l e ) ) ) ; 	 	 	  
 	 	 	 }  
 	 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 	 {  
 	 	 	 	 r e t u r n   f a l s e ;  
 	 	 	 } 	 	 	  
 	 	 }  
 	 	 	 	  
 	 	 o _ O u t F i l e . p r i n t l n ( s L i n e ) ;  
 	 	 r e t u r n   t r u e ; 	 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   v o i d   C l o s e O u t p u t F i l e ( )  
 	 { 	  
 	 	 i f ( o _ O u t F i l e   ! =   n u l l )  
 	 	 { 	  
 	 	 	 o _ O u t F i l e . f l u s h ( ) ;  
 	 	 	 o _ O u t F i l e . c l o s e ( ) ;  
 	 	 }  
 	 }  
 	  
  
 	 p u b l i c   s t a t i c   b o o l e a n   C h e c k W h e t h e r S t o p p e d ( )  
 	 {  
 	 	 t r y  
 	 	 {  
 	 	 	 B u f f e r e d R e a d e r   i n   =   n e w   B u f f e r e d R e a d e r ( n e w   I n p u t S t r e a m R e a d e r ( n e w   F i l e I n p u t S t r e a m ( s _ C o m F i l e ) ) ) ;  
 	 	 	 S t r i n g   s L i n e   =   i n . r e a d L i n e ( ) ;  
 	 	 	 i f ( s L i n e . l e n g t h ( ) > 3 )  
 	 	 	 {  
 	 	 	 	 i n . c l o s e ( ) ;  
 	 	 	 	  
 	 	 	 	 C l o s e O u t p u t F i l e ( ) ;  
 	 	 	 	  
 	 	 	 	 i f ( i _ M o d e ! = M O D E _ C R A W L _ O N L Y )  
 	 	 	 	 {  
 	 	 	 	 	 H B C r a w l H i s t o r y . S a v e ( s _ C r a w l H i s t o r y F i l e ) ;  
 	 	 	 	 }  
 	 	 	  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   C o m m a n d   f o u n d   :   "   +   s L i n e ) ;  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 i n . c l o s e ( ) ;  
 	 	 	 	 r e t u r n   f a l s e ; 	 	 	 	  
 	 	 	 }  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 { 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   A s s u m i n g   S T O P   :   "   +   s _ C o m F i l e ) ;  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 } 	 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   v o i d   S t o p C r a w l e r ( )  
 	 {  
 	 	 t r y  
 	 	 {  
 	 	 	 P r i n t W r i t e r   p w   =   n e w   P r i n t W r i t e r ( n e w   B u f f e r e d W r i t e r ( n e w   F i l e W r i t e r ( H B S i n h a l a C r a w l e r . s _ C o m F i l e ) ) ) ;  
 	 	 	 p w . p r i n t l n ( " S T O P " ) ;  
 	 	 	 p w . f l u s h ( ) ;  
 	 	 	 p w . c l o s e ( ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   S T O P   c o m m a n d   i s s u e d   s u c c e s s f u l l y ! " ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   F a i l e d   t o   w i t e   t h e   S T O P   c o m m a n d   t o   f i l e   :   "   +   s _ C o m F i l e ) ;  
 	 	 }  
 	 }  
 	  
 	 p u b l i c   s t a t i c   v o i d   C l e a r C o m m a n d F i l e ( )  
 	 {  
 	 	 t r y  
 	 	 {  
 	 	 	 P r i n t W r i t e r   p w   =   n e w   P r i n t W r i t e r ( n e w   B u f f e r e d W r i t e r ( n e w   F i l e W r i t e r ( H B S i n h a l a C r a w l e r . s _ C o m F i l e ) ) ) ; 	 	  
 	 	 	 p w . c l o s e ( ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   c o m m a n d   f i l e   c l e a r e d ! " ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 S y s t e m . e r r . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   F a i l e d   t o   c l e a r   t h e   c o m m a n d   t o   f i l e   :   "   +   s _ C o m F i l e ) ;  
 	 	 }  
 	 }  
 	  
 	  
 	 p u b l i c   s t a t i c   S t r i n g   G e t T i m e S t a m p ( )  
 	 {  
 	 	 C a l e n d a r   o C a l   =   C a l e n d a r . g e t I n s t a n c e ( ) ; 	 	  
 	 	 r e t u r n   I n t e g e r . t o S t r i n g ( o C a l . g e t ( C a l e n d a r . Y E A R ) )   +   I n t e g e r . t o S t r i n g ( o C a l . g e t ( C a l e n d a r . M O N T H )   +   1 )   +   o C a l . g e t ( C a l e n d a r . D A Y _ O F _ M O N T H )   +   " _ "   +    
 	 	 	 	 o C a l . g e t ( C a l e n d a r . H O U R _ O F _ D A Y )   +   o C a l . g e t ( C a l e n d a r . M I N U T E )   +   o C a l . g e t ( C a l e n d a r . S E C O N D ) ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   v o i d   S t a r t C r a w l e r T h r e a d s ( )  
 	 { 	 	 	  
                 i n t   n u m b e r O f C r a w l e r s   =   1 ;  
  
                 C r a w l C o n f i g   c o n f i g   =   n e w   C r a w l C o n f i g ( ) ;  
                 c o n f i g . s e t C r a w l S t o r a g e F o l d e r ( s _ T e m p P a t h ) ;  
  
                 / *  
                   *   I n s t a n t i a t e   t h e   c o n t r o l l e r   f o r   t h i s   c r a w l .  
                   * /  
                 c o n f i g . s e t P r o x y H o s t ( " 1 9 2 . 1 6 8 . 2 . 2 " ) ;  
                 c o n f i g . s e t P r o x y P o r t ( 3 1 2 8 ) ;  
                  
                 P a g e F e t c h e r   p a g e F e t c h e r   =   n e w   P a g e F e t c h e r ( c o n f i g ) ;  
                 R o b o t s t x t C o n f i g   r o b o t s t x t C o n f i g   =   n e w   R o b o t s t x t C o n f i g ( ) ;  
                 R o b o t s t x t S e r v e r   r o b o t s t x t S e r v e r   =   n e w   R o b o t s t x t S e r v e r ( r o b o t s t x t C o n f i g ,   p a g e F e t c h e r ) ;  
                  
                 t r y  
                 {  
                 	 o _ C o n t r o l l e r   =   n e w   C r a w l C o n t r o l l e r ( c o n f i g ,   p a g e F e t c h e r ,   r o b o t s t x t S e r v e r ) ;  
                         / *  
                           *   F o r   e a c h   c r a w l ,   y o u   n e e d   t o   a d d   s o m e   s e e d   u r l s .   T h e s e   a r e   t h e   f i r s t  
                           *   U R L s   t h a t   a r e   f e t c h e d   a n d   t h e n   t h e   c r a w l e r   s t a r t s   f o l l o w i n g   l i n k s  
                           *   w h i c h   a r e   f o u n d   i n   t h e s e   p a g e s  
                           * /  
                 	 f o r ( i n t   i = 0 ;   i < l i s t _ B a s e U R L s . s i z e ( ) ;   i + + )  
                 	 {  
                 	 	 o _ C o n t r o l l e r . a d d S e e d ( l i s t _ B a s e U R L s . g e t ( i ) ) ;  
                 	 }  
                 	  
                 	 S y s t e m . o u t . p r i n t l n ( G e t T i m e S t a m p ( )   +   "   :   H B C   :   C r a w l i n g   S t a r t e d " ) ;  
                 	  
                         / *  
                           *   S t a r t   t h e   c r a w l .   T h i s   i s   a   b l o c k i n g   o p e r a t i o n ,   m e a n i n g   t h a t   y o u r   c o d e  
                           *   w i l l   r e a c h   t h e   l i n e   a f t e r   t h i s   o n l y   w h e n   c r a w l i n g   i s   f i n i s h e d .  
                           * /                 	  
                 	 o _ C o n t r o l l e r . s t a r t ( H B D o c u m e n t P r o c e s s o r . c l a s s ,   n u m b e r O f C r a w l e r s ) ;    
         	  
                                                  
                         o _ C o n t r o l l e r . w a i t U n t i l F i n i s h ( ) ;  
                          
                         / / o _ C o n t r o l l e r . S h u t d o w n ( ) ;  
                          
                         S y s t e m . o u t . p r i n t l n ( G e t T i m e S t a m p ( )   +   "   :   H B C   :   C r a w l i n g   C o m p l e t e d " ) ;  
                 }  
                 c a t c h ( E x c e p t i o n   e )  
                 {  
                 	 S y s t e m . o u t . p r i n t l n ( G e t T i m e S t a m p ( )   +   "   :   H B C   :   E r r o r   :   "   +   e . g e t M e s s a g e ( ) ) ;  
                 	 e . p r i n t S t a c k T r a c e ( ) ;  
                 }  
 	 }  
 	  
  
 	  
 	 p u b l i c   v o i d   P r i n t U s a g e ( )  
 	 {  
 	 	 S y s t e m . o u t . p r i n t l n ( " \ n U s a g e   o f   c o r p u s _ b u i l d e r   : \ n " ) ;  
 	 	 S y s t e m . o u t . p r i n t l n ( " c o r p u s _ b u i l d e r   c r a w l   [ B A S E   U R L ]   [ L I M I T ]   [ O U T P U T   F I L E   N A M E ]   < T E M P   F I L E   P A T H >   -   C r a w l s   t h e   w e b   a n d   s t o r e s   t h e   U R L s   i n   t h e   g i v e n   o u t p u t   f i l e " ) ;  
 	 	 S y s t e m . o u t . p r i n t l n ( " c o r p u s _ b u i l d e r   c o l l e c t _ b a t c h   [ U R L   F I L E   N A M E ]   [ O U T P U T   F I L E   N A M E ]   < T E M P   F I L E   P A T H >   -   A n a l y z e   t h e   p a g e s   p o i n t e d   b y   t h e   g i v e n   U R L   l i s t   a n d   s t o r e s   s t a t s   i n   t h e   o u t p u t   f i l e " ) ; 	 	    
 	 	 S y s t e m . o u t . p r i n t l n ( " c o r p u s _ b u i l d e r   c o l l e c t   [ B A S E   U R L ]   [ L I M I T ]   [ O U T P U T   F I L E   N A M E ]   < T E M P   F I L E   P A T H >   -   c r a w l ,   a n a l y z e   a n d   s t o r e s   s t a t s   i n   t h e   o u t p u t   f i l e " ) ; 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " c o r p u s _ b u i l d e r   s t o p   -   S t o p s   a l l   t h e   r u n n i n g   c o r p u s   i n s t a n c e s " ) ; 	 	  
 	 }  
 	  
 	 / * *  
 	   *   @ p a r a m   a r g s  
 	   *    
 	   *   c o r p u s _ b u i l d e r   c r a w l   [ B A S E   U R L ]   [ L I M I T ]   [ O U T P U T   F I L E   N A M E ]     < T E M P   F I L E   P A T H >   -   C r a w l s   t h e   w e b   a n d   s t o r e s   U R L s   i n   a   t e m p   f i l e  
 	   *    
 	   *   c o r p u s _ b u i l d e r   c o l l e c t   [ B A S E   U R L ]   [ L I M I T ]   [ E X T R A C T O R ]   [ O U T P U T   F I L E   N A M E ]     < T E M P   F I L E   P A T H >   -   c r a w l   a n d   p r o c e s s  
 	   *    
 	   *   c o r p u s _ b u i l d e r   c o l l e c t _ b a t c h   [ I N P U T   F I L E   N A M E ]   [ E X T R A C T O R ]   [ O U T P U T   F I L E   N A M E ]     < T E M P   F I L E   P A T H >   -   c r a w l   a n d   p r o c e s s  
 	   *  
 	   *   c o r p u s _ b u i l d e r   s t o p   -   S t o p s   a l l   t h e   r u n n i n g   c o r p u s   i n s t a n c e s   a n d   f l u s h   t h e   o u t p u t   t o   f i l e s  
 	   *    
 	   * /  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )          
 	 { 	 	  
 	 	 / / H B S i n h a l a C r a w l e r 	 o _ C r a w l e r 	 =   n e w   H B S i n h a l a C r a w l e r ( ) ;  
 	 	 	 	 	 	 	 	  
 	 	 b o o l e a n 	 b E r r o r 	 	 	 	 	 =   t r u e ;  
 	 	 s _ A p p P a t h 	 	 	 	 	 	 =   S y s t e m . g e t P r o p e r t y ( " u s e r . d i r " ) ; 	 	  
 	 	 S t r i n g   	 s A c t i o n 	 	 	 	 	 =   " " ;  
 	 	  
 	 	 H B S i n h a l a C r a w l e r . i _ P a g e s P e r R u n 	 =   1 0 0 ;  
 	 	 s _ T e m p P a t h 	 	 	   	 	 	 =   s _ A p p P a t h   +   " / t e m p " ;  
 	 	 s _ C o m F i l e   	 	 	 	 	 	 =   s _ A p p P a t h   +   " / "   +   s _ C o m F i l e ;  
 	 	 s _ C r a w l H i s t o r y F i l e 	 	 	 	 =   s _ A p p P a t h   +   " / d a t a / c r a w l _ h i s t o r y . t x t " ;  
 	 	  
 	 	 	 	  
 	 	 P r o p e r t y C o n f i g u r a t o r . c o n f i g u r e ( s _ A p p P a t h   +   " / c o n f i g s / l o g 4 j . p r o p e r t i e s " ) ;  
 	 	 / / P r o p e r t y C o n f i g u r a t o r . c o n f i g u r e ( " D : \ \ p e r s o n a l \ \ p e r l s o f t \ \ p r o j e c t s \ \ j a v a \ \ c r a w l e r 4 j - 3 . 3 \ \ l o g 4 j . p r o p e r t i e s " ) ;  
 	 	  
 	 	 i f ( a r g s . l e n g t h   >   0 )  
 	 	 {  
 	 	 	 s A c t i o n   =   a r g s [ 0 ] ;  
 	 	 	  
 	 	 	 i f ( s A c t i o n . e q u a l s ( " c r a w l " )   | |   s A c t i o n . e q u a l s ( " c o l l e c t " )   | |   s A c t i o n . e q u a l s ( " s t o p " )   | |   s A c t i o n . e q u a l s ( " c o l l e c t _ b a c h " ) )  
 	 	 	 {  
 	 	 	 	 b E r r o r   =   f a l s e ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   A c t i o n   :   "   +   s A c t i o n ) ;  
 	 	 	 } 	  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 S y s t e m . e r r . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   I n v a l i d   A c t i o n   :   "   +   s A c t i o n ) ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 i f ( s A c t i o n . e q u a l s ( " c r a w l " ) )  
 	 	 {  
 	 	 	 / / [ B A S E   U R L ]   [ L I M I T ]   [ O U T P U T   F I L E   N A M E ]     < T E M P   F I L E   P A T H > 	 	 	  
 	 	 	 i f ( a r g s . l e n g t h   >   3 )  
 	 	 	 {  
 	 	 	 	 S t r i n g   	 s U R L   =   " " ;  
 	 	 	 	 i n t   i L i m i t   =   0 ;  
 	 	 	 	 s U R L   =   a r g s [ 1 ] ;  
 	 	 	 	 i L i m i t   =   I n t e g e r . p a r s e I n t ( a r g s [ 2 ] ) ;  
 	 	 	 	  
 	 	 	 	 H B S i n h a l a C r a w l e r . l i s t _ B a s e U R L s . a d d ( s U R L ) ;  
 	 	 	 	 H B S i n h a l a C r a w l e r . i _ P a g e s P e r R u n   =   i L i m i t ; 	 	  
 	 	 	 	 i f ( a r g s . l e n g t h > 4 )  
 	 	 	 	 {  
 	 	 	 	 	 H B S i n h a l a C r a w l e r . s _ T e m p P a t h   =   a r g s [ 4 ] ;  
 	 	 	 	 }  
 	 	 	 	 H B S i n h a l a C r a w l e r . s _ O u t F i l e   =   s _ A p p P a t h   +   " / "   +   a r g s [ 3 ]   +   " . o u t " ;  
 	 	 	 	 	 	 	 	 	 	 	 	  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   U R L   	 	 	 :   "   +   s U R L ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   P a g e   L i m i t   	 :   "   +   i L i m i t ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   O u t p u t   F i l e   	 :   "   +   H B S i n h a l a C r a w l e r . s _ O u t F i l e ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   T e m p   P a t h   	 :   "   +   H B S i n h a l a C r a w l e r . s _ T e m p P a t h ) ;  
  
 	 	 	 	 H B S i n h a l a C r a w l e r . i _ M o d e   =   H B S i n h a l a C r a w l e r . M O D E _ C R A W L _ O N L Y ; 	  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 	 b E r r o r   =   t r u e ;  
 	 	 }  
 	 	 e l s e   i f ( s A c t i o n . e q u a l s ( " c o l l e c t " ) )  
 	 	 {  
 	 	 	 / / [ B A S E   U R L ]   [ L I M I T ]   [ E X T R A C T O R ]   [ O U T P U T   F I L E   N A M E ]     < T E M P   F I L E   P A T H > 	 	 	  
 	 	 	 i f ( a r g s . l e n g t h   >   4 )  
 	 	 	 {  
 	 	 	 	 S t r i n g   	 s U R L   =   " " ;  
 	 	 	 	 S t r i n g   	 s E x t r a c t o r   =   " " ;  
 	 	 	 	 i n t   i L i m i t   =   0 ;  
 	 	 	 	 s U R L   =   a r g s [ 1 ] ;  
 	 	 	 	 i L i m i t   =   I n t e g e r . p a r s e I n t ( a r g s [ 2 ] ) ;  
 	 	 	 	 s E x t r a c t o r   =   a r g s [ 3 ] ;  
 	 	 	 	  
 	 	 	 	 H B S i n h a l a C r a w l e r . l i s t _ B a s e U R L s . a d d ( s U R L ) ;  
 	 	 	 	 H B S i n h a l a C r a w l e r . i _ P a g e s P e r R u n   =   i L i m i t ; 	  
 	 	 	 	  
 	 	 	 	 i f ( a r g s . l e n g t h > 4 )  
 	 	 	 	 {  
 	 	 	 	 	 H B S i n h a l a C r a w l e r . s _ T e m p P a t h   =   a r g s [ 5 ] ;  
 	 	 	 	 }  
 	 	 	 	 H B S i n h a l a C r a w l e r . s _ O u t F i l e   =   s _ A p p P a t h   +   " / "   +   a r g s [ 4 ]   +   " . o u t " ;  
 	 	 	 	 	 	 	 	 	 	 	 	  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   U R L   	 	 	 :   "   +   s U R L ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   P a g e   L i m i t   	 :   "   +   i L i m i t ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   E x t r a c t o r   	 :   "   +   s E x t r a c t o r ) ; 	 	 	 	  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   O u t p u t   F i l e   	 :   "   +   H B S i n h a l a C r a w l e r . s _ O u t F i l e ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   T e m p   P a t h   	 :   "   +   H B S i n h a l a C r a w l e r . s _ T e m p P a t h ) ;  
 	 	 	  
 	 	 	 	 H B S i n h a l a C r a w l e r . i _ M o d e   =   H B S i n h a l a C r a w l e r . M O D E _ C O L L E C T ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 	 b E r r o r   =   t r u e ;  
 	 	 }  
 	 	 e l s e   i f ( s A c t i o n . e q u a l s ( " c o l l e c t _ b a t c h " ) )  
 	 	 {  
 	 	 	 / /   [ I N P U T   F I L E   N A M E ]   [ E X T R A C T O R ]   [ O U T P U T   F I L E   N A M E ]     < T E M P   F I L E   P A T H >  
 	 	 	 i f ( a r g s . l e n g t h   >   3 )  
 	 	 	 { 	  
 	 	 	 	 S t r i n g   	 s E x t r a c t o r   =   " " ;  
 	 	 	 	  
 	 	 	 	 H B S i n h a l a C r a w l e r . s _ I n p u t F i l e   =   s _ A p p P a t h   +   " / "   +   a r g s [ 1 ] ;  
 	 	 	 	 s E x t r a c t o r   =   a r g s [ 2 ] ;  
 	 	 	 	 H B S i n h a l a C r a w l e r . s _ O u t F i l e   =   s _ A p p P a t h   +   " / "   +   a r g s [ 3 ]   +   " . o u t " ;  
 	 	 	 	  
 	 	 	 	 i f ( a r g s . l e n g t h > 4 )  
 	 	 	 	 {  
 	 	 	 	 	 H B S i n h a l a C r a w l e r . s _ T e m p P a t h   =   a r g s [ 4 ] ;  
 	 	 	 	 }  
  
 	 	 	  
 	 	 	 	 H B S i n h a l a C r a w l e r . L o a d U R L L i s t ( H B S i n h a l a C r a w l e r . s _ I n p u t F i l e ) ; 	 	 	 	  
 	 	 	 	 H B S i n h a l a C r a w l e r . i _ P a g e s P e r R u n   =   H B S i n h a l a C r a w l e r . l i s t _ B a s e U R L s . s i z e ( ) ; 	 	 	 	 	  
 	 	 	 	 	 	  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   U R L   F i l e 	 	 :   "   +   H B S i n h a l a C r a w l e r . s _ I n p u t F i l e ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   P a g e   C o u n t   	 :   "   +   H B S i n h a l a C r a w l e r . i _ P a g e s P e r R u n ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   E x t r a c t o r   	 :   "   +   s E x t r a c t o r ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   O u t p u t   F i l e   	 :   "   +   H B S i n h a l a C r a w l e r . s _ O u t F i l e ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   T e m p   P a t h   	 :   "   +   H B S i n h a l a C r a w l e r . s _ T e m p P a t h ) ; 	 	 	 	  
 	 	 	 	  
 	 	 	 	 H B S i n h a l a C r a w l e r . i _ M o d e   =   H B S i n h a l a C r a w l e r . M O D E _ B A T C H _ C O L L E C T ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 	 b E r r o r   =   t r u e ;  
 	 	 } 	 	  
 	 	 e l s e   i f ( s A c t i o n . e q u a l s ( " s t o p " ) )    
 	 	 {  
 	 	 	 H B S i n h a l a C r a w l e r . S t o p C r a w l e r ( ) ;  
 	 	 	 S y s t e m . e x i t ( 0 ) ;  
 	 	 }  
 	 	 	 	  
 	 	 i f ( ! b E r r o r )  
 	 	 {  
 	 	 	 H B S i n h a l a C r a w l e r . S t a r t C r a w l e r ( ) ;  
 	 	 	 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   A c t i o n   C o m p l e t e d " ) ;  
 	 	 }  
 	 	  
 	 	 S y s t e m . e x i t ( 0 ) ;  
 	 }  
 }  
