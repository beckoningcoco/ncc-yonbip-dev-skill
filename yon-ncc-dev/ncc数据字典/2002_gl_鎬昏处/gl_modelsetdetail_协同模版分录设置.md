# |<<

**协同模版分录设置 (gl_modelsetdetail / nc.vo.gl.reconcilemodule.modelsetdetail)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2430.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_modelsetvoucher | 模板pk | pk_modelsetvoucher | char(20) |  | 主键 (UFID) |
| 2 | pk_accsubj | 科目主键 | pk_accsubj | char(20) |  | 主键 (UFID) |
| 3 | pk_currtype | 币种主键 | pk_currtype | char(20) |  | 主键 (UFID) |
| 4 | pk_sob | 帐簿主键 | pk_sob | char(20) |  | 主键 (UFID) |
| 5 | detailindex | 分录号 | detailindex | int |  | 整数 (Integer) |
| 6 | direct | 方向 | direct | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | assid | 辅助核算标识 | assid | char(20) |  | 主键 (UFID) |
| 8 | explanation | 摘要内容 | explanation | varchar(200) |  | 字符串 (String) |
| 9 | price | 单价 | price | decimal(20, 8) |  | 数值 (UFDouble) |
| 10 | excrate1 | 汇率1 | excrate1 | decimal(15, 8) |  | 数值 (UFDouble) |
| 11 | excrate2 | 汇率2 | excrate2 | decimal(15, 8) |  | 数值 (UFDouble) |
| 12 | amount | 原币发生额 | amount | decimal(20, 4) |  | 数值 (UFDouble) |
| 13 | fracamount | 辅币发生额 | fracamount | decimal(20, 4) |  | 数值 (UFDouble) |
| 14 | localamount | 本币发生额 | localamount | decimal(20, 4) |  | 数值 (UFDouble) |
| 15 | modifyflag | 修改标志 | modifyflag | char(20) |  | 主键 (UFID) |
| 16 | contrastflag | 队对账标志 | contrastflag | int |  | 整数 (Integer) |
| 17 | checkstyle | 结算方式 | checkstyle | varchar(20) |  | 字符串 (String) |
| 18 | checkno | 票据编码 | checkno | varchar(30) |  | 字符串 (String) |
| 19 | checkdate | 票据日期 | checkdate | char(10) |  | 日期 (UFDate) |
| 20 | pk_innersob | 交易单位帐簿主键 | pk_innersob | varchar(20) |  | 字符串 (String) |
| 21 | pk_innercorp | 内部交易单位 | pk_innercorp | varchar(20) |  | 字符串 (String) |
| 22 | isbalancedetail | 是否平衡分录 | isbalancedetail | char(1) |  | 布尔类型 (UFBoolean) |
| 23 | isself | 是否本方 | isself | char(1) |  | 布尔类型 (UFBoolean) |
| 24 | pk_reconciledetail | 协同分录pk | pk_reconciledetail | char(20) |  | 主键 (UFID) |
| 25 | freefield2 | 扩展字段2 | freefield2 | char(20) |  | 主键 (UFID) |
| 26 | freefield3 | 扩展字段3 | freefield3 | char(20) |  | 主键 (UFID) |
| 27 | freefield4 | 扩展字段4 | freefield4 | char(20) |  | 主键 (UFID) |
| 28 | freefield5 | 扩展字段5 | freefield5 | char(20) |  | 主键 (UFID) |
| 29 | freefield1 | 扩展字段1 | freefield1 | char(20) |  | 主键 (UFID) |
| 30 | bankaccount | 银行帐号 | bankaccount | varchar(40) |  | 字符串 (String) |
| 31 | billtype | 票据类型 | billtype | varchar(60) |  | 字符串 (String) |
| 32 | otherreconsubj | 对方协同科目 | otherreconsubj | char(20) |  | 主键 (UFID) |
| 33 | otherfreevalue | 对方协同辅助核算 | otherfreevalue | char(20) |  | 主键 (UFID) |
| 34 | pk_accountingbook | 账簿类型 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 35 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 36 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 37 | pk_setofbook | 核算账簿 | pk_setofbook | char(20) |  | 主键 (UFID) |
| 38 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 39 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 40 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 41 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |