# |<<

**医嘱_临床_照片 (uh_cn_oupt_ord_picture / comyonyou.yh.nhis.cn.ord.picture.vo.UhCnOrdPictureVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6042.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patidata | 患者文件主键 | pk_patidata | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | char(20) |  | 字符串 (String) |
| 3 | pk_org | 组织主键 | pk_org | char(20) |  | 字符串 (String) |
| 4 | pk_ord | 医嘱主键 | pk_ord | char(20) |  | 字符串 (String) |
| 5 | image_name | 图片名称 | image_name | varchar(50) |  | 字符串 (String) |
| 6 | image_url | 图片路径 | image_url | varchar(50) |  | 字符串 (String) |
| 7 | image_type | 图片类型 | image_type | varchar(50) |  | 字符串 (String) |
| 8 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(50) |  | 字符串 (String) |
| 10 | creationtime | 创建时间 | creationtime | varchar(50) |  | 字符串 (String) |
| 11 | modifier | 修改人 | modifier | varchar(50) |  | 字符串 (String) |
| 12 | modifiedtime | 修改时间 | modifiedtime | varchar(50) |  | 字符串 (String) |