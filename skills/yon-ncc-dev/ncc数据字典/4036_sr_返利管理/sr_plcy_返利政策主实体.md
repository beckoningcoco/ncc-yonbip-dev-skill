# |<<

**返利政策主实体 (sr_plcy / nc.vo.sr.policy.entity.PlcyHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5456.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy | 返利政策主实体 | pk_plcy | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 返利政策销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | ctrantypeid | 返利政策类型 | ctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 6 | vcode | 返利政策编码 | vcode | varchar(40) |  | 字符串 (String) |
| 7 | vname | 返利政策名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 8 | ctargetid | 关联指标表 | ctargetid | varchar(20) |  | 指标设置主实体 (sr_target) |
| 9 | fmardimenflag | 物料维度指标设定方式 | fmardimenflag | int |  | 物料指标设定方式 (MartialSetType) |  | 0=全部物料; |