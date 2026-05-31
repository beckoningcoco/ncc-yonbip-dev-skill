# |<<

**到账通知对应关系 (cmp_informermapping / nc.vo.cmp.informer.InformerMappingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1558.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_informermapping | 主键 | pk_informermapping | char(20) | √ | 主键 (UFID) |
| 2 | domain | domain | domain | varchar(20) |  | 银行交易代码(自定义档案) (Defdoc-SYS006_0xx) |
| 3 | family | family | family | varchar(20) |  | 银行交易代码(自定义档案) (Defdoc-SYS006_0xx) |
| 4 | subfamily | subfamily | subfamily | varchar(20) |  | 银行交易代码(自定义档案) (Defdoc-SYS006_0xx) |
| 5 | memo | 摘要 | memo | varchar(20) |  | 银行摘要(自定义档案) (Defdoc-SYS007_0xx) |
| 6 | pk_tradetypeid | 目的交易类型 | pk_tradetypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 8 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | pk_billtypeid | 目的单据类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 12 | pk_banktype | 银行 | pk_banktype | varchar(20) |  | 银行类别 (banktype) |
| 13 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 23 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 24 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 25 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 26 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |