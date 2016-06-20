(ns structured-data)

(defn do-a-thing [x]
  (let [xpx (+ x x)]
   (Math/pow xpx xpx)))

(defn spiff [v]
  (+ (get v 0) (get v 2)))

(defn cutify [v]
   (conj v "<3"))

(defn spiff-destructuring [v]
  (let [first (get v 0)
        third (get v 2)]
  (+ first third)))

(defn point [x y]
  [x y])

(defn rectangle [bottom-left top-right]
  [bottom-left top-right])

(defn width [rectangle]
   (let [ [[x1 y1] [x2 y2]] rectangle] (Math/abs (- x1 x2))))

(defn height [rectangle]
   (let [ [[x1 y1] [x2 y2]] rectangle] (Math/abs (- y1 y2))))

(defn square? [rectangle]
   (let [width  (width  rectangle)
         height (height rectangle) ]  
     (= width height)))

(defn area [rectangle]
  (let [width  (width rectangle)
        height (height rectangle)] 
    (* width height)))

(defn contains-point? [rectangle point]
  (let [ [ [x1 y1] [x2 y2] ] rectangle
         [x  y] point ] (and (<= x1 x x2) (<= y1 y y2)) ))

(defn contains-rectangle? [outer inner]
  :-)

(defn title-length [book]
  :-)

(defn author-count [book]
  :-)

(defn multiple-authors? [book]
  :-)

(defn add-author [book new-author]
  :-)

(defn alive? [author]
  :-)

(defn element-lengths [collection]
  :-)

(defn second-elements [collection]
  :-)

(defn titles [books]
  :-)

(defn monotonic? [a-seq]
  :-)

(defn stars [n]
  :-)

(defn toggle [a-set elem]
  :-)

(defn contains-duplicates? [a-seq]
  :-)

(defn old-book->new-book [book]
  :-)

(defn has-author? [book author]
  :-)

(defn authors [books]
  :-)

(defn all-author-names [books]
  :-)

(defn author->string [author]
  :-)

(defn authors->string [authors]
  :-)

(defn book->string [book]
  :-)

(defn books->string [books]
  :-)

(defn books-by-author [author books]
  :-)

(defn author-by-name [name authors]
  :-)

(defn living-authors [authors]
  :-)

(defn has-a-living-author? [book]
  :-)

(defn books-by-living-authors [books]
  :-)

; %________%
