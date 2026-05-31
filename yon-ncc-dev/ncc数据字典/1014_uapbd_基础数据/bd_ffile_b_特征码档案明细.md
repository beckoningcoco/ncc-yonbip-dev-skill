# |<<

**特征码档案明细 (bd_ffile_b / nc.vo.bd.feature.ffile.entity.FFileBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/844.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cffilebid | 特征码档案明细 | cffilebid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vrowno | 行号 | vrowno | varchar(20) |  | 字符串 (String) |
| 4 | cfclassid | 特征类 | cfclassid | varchar(20) |  | 特征类 (bd_fclass) |
| 5 | cfeaturesid | 特征 | cfeaturesid | varchar(20) |  | 特征 (bd_feature) |
| 6 | bischoice | 选择性 | bischoice | int |  | 选择性类型 (selecttype) |  | 1=单选; |