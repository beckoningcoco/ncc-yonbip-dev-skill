# |<<

**特征价目表明细 (bd_fprice_b / nc.vo.bd.feature.fprice.entity.FPriceItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/847.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cfpricebid | 特征价目表明细 | cfpricebid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | cfclassid | 特征类 | cfclassid | varchar(20) |  | 特征类 (bd_fclass) |
| 4 | cfeatureid | 特征 | cfeatureid | varchar(20) |  | 特征 (bd_feature) |
| 5 | cfeaturebid | 特征明细 | cfeaturebid | varchar(20) |  | 特征明细 (bd_feature_b) |
| 6 | vfvalue | 真实特征值 | vfvalue | varchar(200) |  | 字符串 (String) |
| 7 | vfvaluename | 特征值 | vfvaluename | varchar(200) |  | 字符串 (String) |
| 8 | nprice | 价格 | nprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | cnodeid | 树节点主键 | cnodeid | varchar(60) |  | 字符串 (String) |
| 10 | cpnodeid | 树父节点主键 | cpnodeid | varchar(60) |  | 字符串 (String) |
| 11 | vrowno | 行号 | vrowno | varchar(20) |  | 字符串 (String) |