# |<<

**票据购置 (cmp_note_gzb / nc.vo.cmp.note.gz.NoteGzVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1564.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bill_gz | 购置表主键 | pk_bill_gz | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) | √ | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_balatype | 结算方式 | pk_balatype | varchar(20) |  | 结算方式 (balatype) |
| 6 | pk_notetype | 票据类型 | pk_notetype | varchar(20) |  | 票据类型 (notetype) |
| 7 | bill_series | 票据编号 | bill_series | varchar(40) |  | 字符串 (String) |
| 8 | gz_order | 购置批次 | gz_order | int |  | 整数 (Integer) |
| 9 | gz_date | 购置日期 | gz_date | char(19) |  | 日期 (UFDate) |
| 10 | gz_dept | 购置部门 | gz_dept | varchar(20) |  | 组织_部门 (dept) |
| 11 | gz_person | 购置人 | gz_person | varchar(20) |  | 人员基本信息 (psndoc) |
| 12 | pk_bank | 银行账户 | pk_bank | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 13 | pk_bankdoc | 银行名称 | pk_bankdoc | varchar(20) |  | 银行档案 (bankdoc) |
| 14 | gz_bz | 币种 | gz_bz | varchar(20) |  | 币种 (currtype) |
| 15 | gz_gbf | 工本费 | gz_gbf | decimal(20, 8) |  | 数值 (UFDouble) |
| 16 | gz_sxf | 手续费 | gz_sxf | decimal(20, 8) |  | 数值 (UFDouble) |
| 17 | gz_number | 购置张数 | gz_number | int |  | 整数 (Integer) |
| 18 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 19 | pk_billtypeid | 单据类型主属性 | pk_billtypeid | varchar(20) |  | 字符串 (String) |
| 20 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 40 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 41 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 42 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 43 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |