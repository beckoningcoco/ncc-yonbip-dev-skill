# |<<

**返利政策交易类型 (sr_m4620trantype / nc.vo.sr.policy.trantype.M4620TranTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5453.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_trantype | 政策类型实体 | pk_trantype | char(20) | √ | 主键 (UFID) |
| 2 | ctrantypeid | 交易类型 | ctrantypeid | varchar(20) | √ | 单据类型 (BilltypeVO) |
| 3 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | fcalorgflag | 返利计算组织类型 | fcalorgflag | int |  | 返利计算组织类型 (calorgflag) |  | 0=返利政策组织; |