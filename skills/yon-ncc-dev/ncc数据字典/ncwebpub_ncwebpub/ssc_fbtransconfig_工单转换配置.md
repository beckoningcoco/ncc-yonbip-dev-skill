# |<<

**工单转换配置 (ssc_fbtransconfig / nc.vo.freebill.transformation.FBTransConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5515.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transconfig | 主键 | pk_transconfig | char(20) | √ | 主键 (UFID) |
| 2 | src_billtypecd | 源单据类型 | src_billtypecd | varchar(50) |  | 字符串 (String) |
| 3 | pur_billtypecd | 目的单据类型 | pur_billtypecd | varchar(50) |  | 字符串 (String) |
| 4 | transclass | 转换类 | transclass | varchar(500) |  | 字符串 (String) |