# |<<

**财务报表设置 (gl_fireportset / nc.vo.gl.fireport.FiReportSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2422.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fireportset | 主键 | pk_fireportset | char(20) | √ | 主键 (UFID) |
| 2 | pk_reportsystem | 报表项目体系 | pk_reportsystem | varchar(20) |  | 报表项目体系 (reportsystem) |
| 3 | pk_accscheme | 会计期间方案 | pk_accscheme | varchar(20) |  | 会计期间方案 (accperiodscheme) |
| 4 | amount_prop | 金额性质 | amount_prop | int |  | 整数 (Integer) |
| 5 | pk_currency | 币种 | pk_currency | varchar(20) |  | 币种 (currtype) |
| 6 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 7 | include_untally | 包含未记账凭证 | include_untally | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | ismainbook | 按主账簿取数 | ismainbook | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 10 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 14 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |