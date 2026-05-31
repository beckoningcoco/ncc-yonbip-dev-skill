# |<<

**选择条件 (bd_bom_select / nc.vo.bd.bom.bom0202.entity.BomSelectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/377.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbom_select | 选择条件主键 | cbom_select | char(20) | √ | 主键 (UFID) |
| 2 | gcfeatureclassid | 特征类 | gcfeatureclassid | varchar(20) |  | 特征类 (bd_fclass) |
| 3 | gcfeatureid | 特征 | gcfeatureid | varchar(20) |  | 特征 (bd_feature) |
| 4 | gcfeaturevalue | 特征值 | gcfeaturevalue | varchar(181) |  | 字符串 (String) |
| 5 | gcfeaturedatavalue | 档案真实特征值 | gcfeaturedatavalue | varchar(181) |  | 字符串 (String) |