# |<<

**查询条件 (gl_querycondition / nc.vo.gl.queryCondition.querycondition)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2448.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_querycondition | 查询条件主键 | pk_querycondition | char(20) | √ | 主键 (UFID) |
| 2 | year | 年 | year | char(4) |  | 主键 (UFID) |
| 3 | startperiod | 起始期间 | startperiod | char(2) |  | 主键 (UFID) |
| 4 | endperiod | 结束期间 | endperiod | char(2) |  | 主键 (UFID) |
| 5 | includeuntalliedflag | 是否包含未记账凭证 | includeuntalliedflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | includerealtimeflag | 是否包含实时凭证 | includerealtimeflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | sortstyle | 排序方式 | sortstyle | int |  | 整数 (Integer) |
| 8 | pk_currtype | 币种主键 | pk_currtype | varchar(20) |  | 字符串 (String) |
| 9 | pk_accsubj | 科目 | pk_accsubj | char(20) |  | 主键 (UFID) |
| 10 | booknode | 打印账簿节点号 | booknode | varchar(20) |  | 字符串 (String) |
| 11 | showsettleinfoflag | 是否显示结算信息 | showsettleinfoflag | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 13 | pk_org | 财务组织 | pk_org | char(20) |  | 主键 (UFID) |
| 14 | pk_setofbook | 核算 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 15 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 16 | free1 | 预留字段1 | free1 | varchar(60) |  | 字符串 (String) |
| 17 | free2 | 预留字段2 | free2 | varchar(60) |  | 字符串 (String) |
| 18 | free3 | 预留字段3 | free3 | varchar(60) |  | 字符串 (String) |
| 19 | free4 | 预留字段4 | free4 | varchar(60) |  | 字符串 (String) |
| 20 | free5 | 预留字段5 | free5 | varchar(60) |  | 字符串 (String) |
| 21 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 22 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 24 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |