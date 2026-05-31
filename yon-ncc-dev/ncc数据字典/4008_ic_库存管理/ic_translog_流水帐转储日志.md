# |<<

**流水帐转储日志 (ic_translog / nc.vo.ic.flowaccount.entity.FlowTransLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2995.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_translog | 主属性 | pk_translog | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | dtransdate | 转储日期 | dtransdate | char(19) |  | 日期 (UFDate) |
| 4 | cuserid | 操作人 | cuserid | varchar(20) |  | 用户 (user) |
| 5 | dbillenddate | 转储单据截止日期 | dbillenddate | char(19) |  | 日期(开始) (UFDateBegin) |