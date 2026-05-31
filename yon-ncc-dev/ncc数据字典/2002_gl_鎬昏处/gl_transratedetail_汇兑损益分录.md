# |<<

**汇兑损益分录 (gl_transratedetail / nc.vo.gl.transrate.TransrateDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2495.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transratedetail | 汇兑分录标识 | pk_transratedetail | char(20) | √ | 主键 (UFID) |
| 2 | pk_accsubj | 会计科目 | pk_accsubj | varchar(20) |  | 会计科目 (accasoa) |
| 3 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 4 | orientation | 方向 | orientation | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | detailorder | 序号 | detailorder | int |  | 整数 (Integer) |
| 6 | istransfer | 是否汇兑 | istransfer | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | ass | 转出辅助核算 | ass | varchar(1000) |  | 字符串 (String) |
| 8 | inass | 入账辅助核算 | inass | varchar(1000) |  | 字符串 (String) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织 (org) |
| 11 | pk_unit | 业务单元 | pk_unit | varchar(20) |  | 组织 (org) |
| 12 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | creationtime | 创建日期 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 修改日期 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |