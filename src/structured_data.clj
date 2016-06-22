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
  (let [ [[x1 y1] [x2 y2]]  outer
         [[x3 y3] [x4 y4]]  inner ]
     (and (contains-point? outer (get inner 0)) (contains-point? outer (get inner 1)))))

(defn title-length [book]
  (count (:title book)))

(defn author-count [book]
  (count (:authors book)))

(defn multiple-authors? [book]
   (> (author-count book) 1))

(defn add-author [book new-author]
  (assoc book :authors (conj (:authors book) new-author)))

(defn alive? [author]
  (not (contains? author :death-year)))

(defn element-lengths [collection]
  (map count collection))

(defn second-elements [collection]
  (let [get-second (fn [vec] (get vec 1))] 
      (map get-second collection)))

(defn titles [books]
   (let [get-single-title (fn [book] (:title book))] 
     (map get-single-title books)))

(defn monotonic? [a-seq]
  (or (apply >= a-seq) (apply <= a-seq)))

(defn stars [n]
  (apply str (repeat n "*")))

(defn toggle [a-set elem]
  (cond
    (contains? a-set elem) (disj a-set elem)
    :else (conj a-set elem)))

(defn contains-duplicates? [a-seq]
  (cond
   (> (count a-seq) (count (set a-seq)))  true
   :else false))

(defn old-book->new-book [book]
  (assoc book :authors (set (:authors book))))

(defn has-author? [book author]
   (contains? (:authors book) author))

(defn authors [books]
  (apply clojure.set/union (map :authors books)))

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
