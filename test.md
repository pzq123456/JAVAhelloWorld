OAI-ZIB dataset 

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

This archive contains manual segmentations of the OAI-ZIB dataset stored as label/voxel fields saved in the 'ITK MetaImage MHD'-format. 

The data is strongly connected to the following research article:

Automated Segmentation of Knee Bone and Cartilage combining Statistical Shape Knowledge and Convolutional Neural Networks: Data from the Osteoarthritis Initiative
Ambellan*, Tack*, Ehlke, Zachow; https://doi.org/10.1016/j.media.2018.11.009; Medical Image Analysis 52 (2019): 109-118

A preprint (technical report) of the article can be found here: http://nbn-resolving.de/urn:nbn:de:0297-zib-72704

The above article is an extended version of the MIDL2018 conference paper:

Automated Segmentation of Knee Bone and Cartilage combining Statistical Shape Knowledge and Convolutional Neural Networks: Data from the Osteoarthritis Initiative
Ambellan*, Tack*, Ehlke, Zachow; International Conference on Medical Imaging with Deep Learning; 2018

The conference paper (and thus a preprint to the research article) is available at OpenReview.net:

https://openreview.net/pdf?id=SJ_-Nx3jz

The oral presentation at MIDL2018 (Amsterdam, July 4th 2018) with many additional visualizations was recorded by the MIDL Society and is available on YouTube:

https://www.youtube.com/watch?v=YvNiC96U8-A

* Equal contribution.

If you intend to use the OAI-ZIB dataset in a publication please cite the aforementioned research article properly (see the bibtex file in the doc folders).

Note that the respective MRI scans are part of the Osteoarthritis Initiative (OAI) database (https://oai.nih.gov) and are thus not(!) part of this collection.
They are subject to the copyright of the OAI, please see there for more information on the data use agreement as well as the publication and presentation guide lines.
Nevertheless, we provide a list of MRI scans used to generate the segmentation masks in the doc folders.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

The archieve is structured as follows:

.
├── segmentation
│   ├── doc
│   │   └── ...
│   └── segmentation_masks
│   │   └── ...
├── classification
│   ├── doc
│   │   └── ...
│   └── segmentation_masks
│   │   └── ...
└── README

File 'README' is the one you are currently reading.

Folder 'segmentation' contains the OAI-ZIB dataset as explained above and is the main content of this archieve. If you are interested in segmentation, this is all you need.

Folder 'classification' contains manual segmentations of data from the OAI database, which is mainly also contained in OAI-ZIB and that can be used for osteoarthritis classification experiments. If you are  interested in (bone) shape-based osteoarthritis classification, this directory contains what you are looking for.

The content of both subfolders is described in the following:

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
segmentation folder ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

segmentation ── doc folder:

doc
├── 2foldCrossValidation-List1.txt
├── 2foldCrossValidation-List2.txt
├── bibtex-MedIA.bib
├── oai_mri_paths.txt
└── readMaskSimpleITK.py


'2foldCrossValidation-List1.txt' contains 253 IDs and '2foldCrossValidation-List2.txt' contains 254 IDs. Both together serve as two-fold cross-validation setup.

In 'bibtex-MedIA.bib' there is bibliographic information that we would like you to consider for a citation in case you intend to publish work using the OAI-ZIB dataset.
The file 'oai_mri_paths.txt' lists the path within the OAI database (relative to the baseline time point) to the respective MRI scan for each patient within OAI-ZIB.
The python snippet 'readMaskSimpleITK.py' exemplary shows how to read a segmentation mask into a numpy array using SimpleITK. 

Sequence used: Dual Echo Steady State (DESS)
Time point used: baseline

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

segmentation ── segmentation_masks folder:

segmentation_masks
├── 9001104.segmentation_masks.mhd
├── 9001104.segmentation_masks.raw
...
├── 9996098.segmentation_masks.mhd
└── 9996098.segmentation_masks.raw


Each segmentation mask contains voxels labeled as follows:

0 - background
1 - femoral bone
2 - femoral cartilage
3 - tibial bone
4 - tibial cartilage

Attention: The segmentation masks do not carry a transformation (pose information), i.e. they fit the MRI scans up to rigid alignment. To display MRIs and segmentation 
masks together either consider the removal of transformations from the MRI scans or apply the transformations from the MRI scans to the segmentation masks.

Additional details on the OAI-ZIB dataset (e.g. demographics) and its generation can be found in the aforementioned article.

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
classification folder ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

The content of folder 'classification' served as prerequisite for osteoarthritis classification experiments in:

A Surface-Theoretic Approach for Statistical Shape Modeling 
Ambellan, Zachow, von Tycowicz; https://doi.org/10.1007/978-3-030-32251-9_3; Proc. Medical Image Computing and Computer Assisted Intervention (MICCAI) (2019), Part IV: 21-29.

An as-invariant-as-possible GL+(3)-based Statistical Shape Model
Ambellan, Zachow, von Tycowicz;  https://doi.org/10.1007/978-3-030-33226-6_23; Proc. 7th MICCAI workshop on Mathematical Foundations of Computational Anatomy (MFCA) (2019), 219-228. 

An efficient Riemannian Statistical Shape Model using Differential Coordinates: with Application to the Classification of Data from the Osteoarthritis Initiative
von Tycowicz*, Ambellan*, Mukhopadhyay, Zachow; https://doi.org/10.1016/j.media.2017.09.004; Medical Image Analysis 43 (2018): 1-9.

* Equal contribution.

Further details on the data (e.g. clinical score) can be found in the above mentioned publications and their supplemental maerials.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

classification ── doc folder:

doc
├── bibtex-MedIA.bib
├── oai_mri_paths.txt
└── readMaskSimpleITK.py


In 'bibtex-MedIA.bib' there is bibliographic information that we would like you to consider for a citation in case you intend to publish work using this data.
The file 'oai_mri_paths.txt' lists the path within the OAI database (relative to the baseline time point) to the respective MRI scan for each patient within the dataset.
The python snippet 'readMaskSimpleITK.py' exemplary shows how to read a segmentation mask into a numpy array using SimpleITK. 

Sequence used: Dual Echo Steady State (DESS)
Time point used: baseline

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

classification ── segmentation_masks folder:

segmentation_masks
├── 9008561.segmentation_masks.mhd
├── 9008561.segmentation_masks.raw
...
├── 9988421.segmentation_masks.mhd
└── 9988421.segmentation_masks.raw


Each segmentation mask contains voxels labeled as follows:

0 - background
1 - femoral bone
2 - tibial bone

Attention: The segmentation masks do not carry a transformation (pose information), i.e. they fit the MRI scans up to rigid alignment. To display MRIs and segmentation 
masks together either consider the removal of transformations from the MRI scans or apply the transformations from the MRI scans to the segmentation masks.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Copyright:

The segmentation data is given out as is with absolutely no warranties. Publications using this data shall acknowledge it adequately through citation of the related
research article (see bibtex file in doc directory). Usage is allowed for scientific purposes only and free of charge.

(c) 2018, 2019, 2020 The authors.

```py
# readMaskSimpleITK.py
#
# This script snippet is written to might be helpful and it comes with absolutely no warranties.
# Feel free to change anything to fit your personal needs.
#
import matplotlib.pyplot as plt
import SimpleITK as sitk
import numpy as np
from PIL import Image as image

full_mhd_path = "/<PathToOAI-ZIB>/OAI-ZIB/segmentation_masks/9002430.segmentation_masks.mhd"

itkimage = sitk.ReadImage(full_mhd_path)
numpyImage = sitk.GetArrayFromImage(itkimage)
# print the unique value of the segmentation mask
print(np.unique(numpyImage))

# filter the value != 1 and fill the rest with 0
# numpyImage[numpyImage != 1] = 0
# only display the 2 and 4 labels
numpyImage[numpyImage == 2] = 4
numpyImage[numpyImage == 3] = 0
numpyImage[numpyImage == 1] = 0
numpyImage[numpyImage == 4] = 1



# display slice number 60 (sagittal direction)
img = image.fromarray(numpyImage[:,:,60]*60, 'L')
plt.imshow(img)
```