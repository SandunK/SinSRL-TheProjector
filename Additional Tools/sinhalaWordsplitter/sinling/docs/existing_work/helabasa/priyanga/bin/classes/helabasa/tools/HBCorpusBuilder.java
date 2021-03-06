 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . t o o l s ;  
  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . u t i l s . H B D a t a b a s e ;  
  
 i m p o r t   j a v a . i o . F i l e I n p u t S t r e a m ;  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . I n p u t S t r e a m R e a d e r ;  
 i m p o r t   j a v a . i o . R e a d e r ;  
 i m p o r t   j a v a . n i o . c h a r s e t . C h a r s e t ;  
 i m p o r t   j a v a . s q l . C o n n e c t i o n ;  
 i m p o r t   j a v a . s q l . P r e p a r e d S t a t e m e n t ;  
 i m p o r t   j a v a . s q l . R e s u l t S e t ;  
 i m p o r t   j a v a . s q l . S t a t e m e n t ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
 i m p o r t   j a v a . u t i l . M a p ;  
  
 p u b l i c   c l a s s   H B C o r p u s B u i l d e r   {  
  
 	 p r i v a t e   M a p < S t r i n g ,   H B C W o r d E n t r y >   m a p _ C o r p u s   =   n e w   H a s h M a p < S t r i n g ,   H B C W o r d E n t r y > ( ) ;  
 	 p r i v a t e   i n t   i _ W o r d s I n F i l e   =   0 ;  
 	  
 	 p u b l i c   H B C o r p u s B u i l d e r ( )   {  
 	 	 i _ W o r d s I n F i l e   =   0 ;  
 	 }  
  
 	  
 	 p u b l i c   v o i d   L o a d C o r p u s ( )  
 	 {  
 	 	 C o n n e c t i o n   o C o n   =   H B D a t a b a s e . C o n n e c t T o D B ( ) ;  
 	 	 S t r i n g   s S Q L   =   " s e l e c t   w o r d _ i d ,   w o r d ,   f r e q u e n c y   f r o m   h b c _ w o r d s " ; 	 	  
 	 	 R e s u l t S e t   o R S   =   n u l l ;  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 S t a t e m e n t   s Q u e r y   =   o C o n . c r e a t e S t a t e m e n t ( ) ;  
 	 	 	 o R S   =   s Q u e r y . e x e c u t e Q u e r y ( s S Q L ) ;  
 	 	 	 	 	  
 	 	 	 w h i l e ( o R S . n e x t ( ) )  
 	 	 	 { 	 	 	 	  
 	 	 	 	 l o n g   l I D   =   o R S . g e t L o n g ( " w o r d _ i d " ) ;  
 	 	 	 	 S t r i n g   s W o r d   =   o R S . g e t S t r i n g ( " w o r d " ) ;  
 	 	 	 	 l o n g   l F r e q   =   o R S . g e t L o n g ( " f r e q u e n c y " ) ;  
 	 	 	 	 	 	 	 	  
 	 	 	 	 H B C W o r d E n t r y   o E n t r y   =   n e w   H B C W o r d E n t r y ( l I D ,   s W o r d ,   l F r e q ) ;  
 	 	 	 	 m a p _ C o r p u s . p u t ( s W o r d ,   o E n t r y ) ;  
 	 	 	 } 	 	 	 	 	 	  
 	 	 	 o R S . c l o s e ( ) ;  
 	 	 	  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " C o r p u s   S i z e   =   "   +   m a p _ C o r p u s . s i z e ( ) ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 	 	 	 	  
 	 	 	 o C o n . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   L o a d i n g   C o r p u s   F a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	 	  
 	 	  
 	 }  
 	  
 	 p u b l i c   v o i d   L o a d N e w D a t a ( S t r i n g   s F i l e N a m e ,   S t r i n g   s C h a r S e t / * * " U T F - 1 6 " * * / )  
 	 {  
 	 	 t r y { 	 	  
 	 	 	 S t r i n g B u f f e r   s b W o r d   =   n e w   S t r i n g B u f f e r ( ) ;  
 	 	 	 R e a d e r   o R e a d e r   =   n e w   I n p u t S t r e a m R e a d e r ( n e w   F i l e I n p u t S t r e a m ( s F i l e N a m e ) ,   C h a r s e t . f o r N a m e ( s C h a r S e t ) ) ;  
 	 	 	 i n t   i   =   0 ;  
 	 	 	 w h i l e   ( ( i   =   o R e a d e r . r e a d ( ) )   ! =   - 1 )    
 	 	 	 {  
 	 	 	 	 / /   c a s t   t o   c h a r .   T h e   c a s t i n g   r e m o v e s   t h e   l e f t   m o s t   b i t .    
 	 	 	 	 c h a r   c   =   ( c h a r )   i ;  
 	 	 	 	 / / S y s t e m . o u t . p r i n t ( c ) ;  
 	 	 	 	 i f ( I s D e l i m e t e r ( c ) )  
 	 	 	 	 {  
 	 	 	 	 	 S t r i n g   s W o r d   =   s b W o r d . t o S t r i n g ( ) ;  
 	 	 	 	 	 i f ( H e l a b a s a . I s S i n h a l a W o r d ( s W o r d ) )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 A d d W o r d ( s W o r d ) ;  
 	 	 	 	 	 }  
 	 	 	 	 	  
 	 	 	 	 	 s b W o r d . s e t L e n g t h ( 0 ) ;  
 	 	 	 	 }  
 	 	 	 	 e l s e  
 	 	 	 	 {  
 	 	 	 	 	 s b W o r d . a p p e n d ( c ) ;  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	 o R e a d e r . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( I O E x c e p t i o n   e )  
 	 	 {  
 	 	  
 	 	 }  
 	 } 	  
 	  
 	 p r i v a t e   b o o l e a n   I s D e l i m e t e r ( c h a r   c )  
 	 {  
 	 	 i f ( c = = '   '   | |   c = = ' . '   | |   c = = ' , '   | |   c = = ' ? '   | |   c = = ' ; '   | |   c = = ' : '   | |   c = = ' " '   | |   c = = ' \ ' '   | |   c = = ' > '    
 	 	 	 	 | |   c = = ' < '   | |   c = = ' ! '   | |   c = = ' ` '   | |   c = = ' ~ '   | |   c = = ' @ '   | |   c = = ' $ '   | |   c = = ' % '   | |   c = = ' ^ '   | |   c = = ' & '    
 	 	 	 	 | |   c = = ' * '   | |   c = = ' ( '   | |   c = = ' ) '   | |   c = = ' - '   | |   c = = ' _ '   | |   c = = ' = '   | |   c = = ' + '   | |   c = = ' { '   | |   c = = ' [ '    
 	 	 	 	 | |   c = = ' ] '   | |   c = = ' } '   | |   c = = ' \ \ '   | |   c = = ' | ' )  
 	 	 {  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	 e l s e    
 	 	 	 r e t u r n   f a l s e ;  
 	 }  
 	  
 	  
 	 p r i v a t e   v o i d   A d d W o r d ( S t r i n g   s W o r d )  
 	 { 	 	  
 	 	 i _ W o r d s I n F i l e + + ;  
 	 	 H B C W o r d E n t r y   o E n t r y   =   m a p _ C o r p u s . g e t ( s W o r d ) ;  
 	 	 i f ( o E n t r y = = n u l l )  
 	 	 {  
 	 	 	 m a p _ C o r p u s . p u t ( s W o r d ,   n e w   H B C W o r d E n t r y ( s W o r d ,   1 ) ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 o E n t r y . A d d O c c u r a n c e ( 1 ) ;  
 	 	 }  
 	 }  
 	  
  
 	 p r i v a t e   b o o l e a n   I n s e r t W o r d ( P r e p a r e d S t a t e m e n t   o S t m t ,   H B C W o r d E n t r y   o E n t r y )  
 	 {  
 	 	 / / S t r i n g   s S Q L   =   " i n s e r t   i n t o   h b c _ w o r d s ( w o r d _ i d ,   w o r d ,   f r e q u e n c y )   v a l u e s   ( ? ,   ? ,   ? ) " ; 	 	 	  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 o S t m t . s e t L o n g ( 1 ,   o E n t r y . G e t I D ( ) ) ;  
 	 	 	 o S t m t . s e t S t r i n g ( 2 ,   o E n t r y . G e t W o r d ( ) ) ;  
 	 	 	 o S t m t . s e t L o n g ( 3 ,   o E n t r y . G e t F r e q u e n c y ( ) ) ;  
 	 	 	 o S t m t . e x e c u t e U p d a t e ( ) ;  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   I n s e r t   W o r d   "   +   o E n t r y . G e t W o r d ( )     +   "   t o   C o r p u s   F a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	 	  
 	 	 r e t u r n   f a l s e ; 	  
 	 }  
 	  
 	 p r i v a t e   b o o l e a n   U p d a t e W o r d ( P r e p a r e d S t a t e m e n t   o S t m t ,   H B C W o r d E n t r y   o E n t r y )  
 	 {  
 	 	 / / S t r i n g   s S Q L   =   " u p d a t e   h b c _ w o r d s   s e t   f r e q u e n c y = ?   w h e r e   w o r d _ i d = ? " ; 	 	 	  
 	 	  
 	 	 t r y  
 	 	 { 	 	 	  
 	 	 	 o S t m t . s e t L o n g ( 1 ,   o E n t r y . G e t F r e q u e n c y ( ) ) ;  
 	 	 	 o S t m t . s e t L o n g ( 2 ,   o E n t r y . G e t I D ( ) ) ;  
 	 	 	 o S t m t . e x e c u t e U p d a t e ( ) ;  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   U p d a t e   W o r d   F r e q u e n c y   o f   "   +   o E n t r y . G e t W o r d ( )     +   "   t o   "   +   o E n t r y . G e t F r e q u e n c y ( )   +   "   F a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	 	  
 	 	 r e t u r n   f a l s e ;  
 	 } 	  
 	  
 	 p u b l i c   v o i d   U p d a t e C o r p u s ( )  
 	 { 	 	  
 	 	 S t r i n g   s I n s e r t S Q L   =   " i n s e r t   i n t o   h b c _ w o r d s ( w o r d _ i d ,   w o r d ,   f r e q u e n c y )   v a l u e s   ( ? ,   ? ,   ? ) " ; 	 	  
 	 	 S t r i n g   s U p d a t e S Q L   =   " u p d a t e   h b c _ w o r d s   s e t   f r e q u e n c y = ?   w h e r e   w o r d _ i d = ? " ;  
 	 	 P r e p a r e d S t a t e m e n t   o I n s e r t S t m t   =   n u l l ;  
 	 	 P r e p a r e d S t a t e m e n t   o U p d a t e S t m t   =   n u l l ;  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   H B D a t a b a s e . C o n n e c t T o D B ( ) ;  
 	 	 t r y  
 	 	 { 	 	 	  
 	 	 	 o I n s e r t S t m t   =       o C o n . p r e p a r e S t a t e m e n t ( s I n s e r t S Q L ) ;  
 	 	 	 o U p d a t e S t m t   =       o C o n . p r e p a r e S t a t e m e n t ( s U p d a t e S Q L ) ; 	 	 	 	 	 	  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   C o n n e c t i n g   t o   C o r p u s   F a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	 	 	  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " W o r d s   i n   F i l e   =   "   +   i _ W o r d s I n F i l e ) ;  
 	 	 	 	  
 	 	 i n t   i N e w   =   0 ;  
 	 	 i n t   i U p d   =   0 ;  
 	 	 i n t   i O l d   =   0 ;  
 	 	  
 	 	 f o r   ( M a p . E n t r y < S t r i n g ,   H B C W o r d E n t r y >   o E n t r y   :   m a p _ C o r p u s . e n t r y S e t ( ) )    
 	 	 { 	 	          
 	 	         H B C W o r d E n t r y   o V a l u e   =   o E n t r y . g e t V a l u e ( ) ;  
  
 	 	         i f ( o V a l u e . G e t S t a t u s ( ) = = H B C W o r d E n t r y . H B C _ S T A T U S _ N E W )  
 	 	         {  
 	 	         	 / / S y s t e m . o u t . p r i n t l n ( " N E W   :   "   +     o V a l u e . G e t I D ( )   +   "   :   "   +   s K e y   +   "   :   "   +   o V a l u e . G e t F r e q u e n c y ( ) ) ;  
 	 	         	 i f ( I n s e r t W o r d ( o I n s e r t S t m t ,   o V a l u e ) )  
 	 	         	 {  
 	 	         	 	 i N e w + + ;  
 	 	         	 }  
 	 	         }  
 	 	         e l s e   i f ( o V a l u e . G e t S t a t u s ( ) = = H B C W o r d E n t r y . H B C _ S T A T U S _ U P D A T E D )  
 	 	         {  
 	 	         	 / / S y s t e m . o u t . p r i n t l n ( " U P D   :   "   +     o V a l u e . G e t I D ( )   +   "   :   "   +   s K e y   +   "   :   "   +   o V a l u e . G e t F r e q u e n c y ( ) ) ;  
 	 	         	 i f ( U p d a t e W o r d ( o U p d a t e S t m t ,   o V a l u e ) )  
 	 	         	 {  
 	 	         	 	 i U p d + + ;  
 	 	         	 } 	 	          
 	 	         }  
 	 	         e l s e  
 	 	         {  
 	 	         	 / / S y s t e m . o u t . p r i n t l n ( " O L D   :   "   +     o V a l u e . G e t I D ( )   +   "   :   "   +   s K e y   +   "   :   "   +   o V a l u e . G e t F r e q u e n c y ( ) ) ;  
 	 	         	 i O l d + + ;  
 	 	         } 	 	         	  
 	 	 }  
  
 	 	 t r y  
 	 	 { 	 	 	 	 	 	  
 	 	 	 o C o n . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   D i c o n n e c t i n g   t o   C o r p u s   F a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	  
 	 	  
 	 	 S y s t e m . o u t . p r i n t l n ( " N e w   W o r d s   =   "   +   i N e w ) ;  
 	 	 S y s t e m . o u t . p r i n t l n ( " U p d a t e d   W o r d s   =   "   +   i U p d ) ;  
 	 	 S y s t e m . o u t . p r i n t l n ( " U n c h a n g e d   W o r d s   =   "   +   i O l d ) ;  
 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 S y s t e m . o u t . p r i n t l n ( " C o r p u s   S i z e   =   "   +   m a p _ C o r p u s . s i z e ( ) ) ;  
 	 }  
 	  
 	 / * *  
 	   *   @ p a r a m   a r g s  
 	   * /  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
  
 	 	 S t r i n g   s F i l e N a m e   =   a r g s [ 0 ] ;    
 	 	 S t r i n g   s C h a r S e t   =   a r g s [ 1 ] ;  
 	 	  
 	 	 H B C o r p u s B u i l d e r   o H B C   =   n e w   H B C o r p u s B u i l d e r ( ) ;  
 	 	  
 	 	 o H B C . L o a d C o r p u s ( ) ;  
 	 	 o H B C . L o a d N e w D a t a ( s F i l e N a m e ,   s C h a r S e t ) ;  
 	 	 o H B C . U p d a t e C o r p u s ( ) ;  
 	 }  
  
 }  
