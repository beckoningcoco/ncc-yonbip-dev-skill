# |<<

**折算账簿关联定义 (gl_soblink / nc.vo.gl.soblink.soblink)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2477.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_soblink | 关联标识 | pk_soblink | char(20) | √ | 折算规则 (convertrule) |
| 2 | sn | 关联编号 | sn | char(4) |  | 主键 (UFID) |
| 3 | pk_org | 会计主体 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_srcbook | 来源账簿 | pk_srcbook | char(20) |  | 主键 (UFID) |
| 5 | pk_desbook | 目的账簿 | pk_desbook | char(20) |  | 主键 (UFID) |
| 6 | fcstyle | 折算时机 | fcstyle | int |  | 整数 (Integer) |
| 7 | fctime | 定时折算时间 | fctime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | exceptionhandlestyle | 金额不平处理方式 | exceptionhandlestyle | int |  | 整数 (Integer) |
| 9 | pk_repairsubj | 补差科目 | pk_repairsubj | char(20) |  | 主键 (UFID) |
| 10 | autocreatevs | 生成凭证是否自动记帐 | autocreatevs | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_assessor | 审核人 | pk_assessor | char(20) |  | 主键 (UFID) |
| 12 | pk_tally | 记账人 | pk_tally | char(20) |  | 主键 (UFID) |
| 13 | pk_prepare | 制单人 | pk_prepare | char(20) |  | 主键 (UFID) |
| 14 | pk_casher | 出纳 | pk_casher | char(20) |  | 主键 (UFID) |
| 15 | pdstyle | 制单日期折算方式 | pdstyle | int |  | 整数 (Integer) |
| 16 | initconvert | 期初折算 | initconvert | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | realtimeflag | 实时折算 | realtimeflag | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | combindetail | 是否合并分录 | combindetail | char(1) |  | 布尔类型 (UFBoolean) |
| 19 | isdifflag | 是否差异账簿 | isdifflag | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | pk_accountingbook | 核算账簿 | pk_accountingbook | char(20) |  | 主键 (UFID) |
| 21 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 22 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | modifier | 修改人 | modifier | char(20) |  | 主键 (UFID) |
| 24 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |