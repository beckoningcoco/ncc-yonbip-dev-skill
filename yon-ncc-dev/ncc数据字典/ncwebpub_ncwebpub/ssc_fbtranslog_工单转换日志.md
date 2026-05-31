# |<<

**工单转换日志 (ssc_fbtranslog / nc.vo.freebill.transformation.FBTransLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5516.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_translog | 主键 | pk_translog | char(20) | √ | 主键 (UFID) |
| 2 | src_billid | 源单据PK | src_billid | char(20) |  | 主键 (UFID) |
| 3 | src_billtypecd | 源单据类型 | src_billtypecd | varchar(50) |  | 字符串 (String) |
| 4 | pur_billid | 目的单据PK | pur_billid | char(20) |  | 主键 (UFID) |
| 5 | pur_billtypecd | 目的单据类型 | pur_billtypecd | varchar(50) |  | 字符串 (String) |