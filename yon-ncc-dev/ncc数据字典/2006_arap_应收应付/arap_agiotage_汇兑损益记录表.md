# |<<

**汇兑损益记录表 (arap_agiotage / nc.vo.arap.agiotage.AgiotageMainVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/140.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_agiotage | 汇兑损益记录标识 | pk_agiotage | char(20) | √ | 主键 (UFID) |
| 2 | billmaker | 处理人 | billmaker | varchar(0) |  | 用户 (user) |
| 3 | busidate | 处理日期 | busidate | char(19) |  | 日期 (UFDate) |
| 4 | pk_org | 主组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | currtype | 币种 | currtype | varchar(20) |  | 币种 (currtype) |
| 7 | systemcode | 系统 | systemcode | int |  | 单据来源系统 (src_syscode) |  | 0=应收系统; |