# |<<

**设备图片 (pam_equip_image / nc.vo.aim.equip.EquipImageVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4250.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_equip_image | 设备图片 | pk_equip_image | char(20) | √ | 主键 (UFID) |
| 2 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 3 | image | 图片 | image | image |  | 图片类型 (IMAGE) |
| 4 | previewimage | 缩略图片 | previewimage | image |  | 图片类型 (IMAGE) |
| 5 | pk_image_file | 图片文件ID | pk_image_file | varchar(40) |  | 字符串 (String) |
| 6 | isdefault | 默认标识 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |