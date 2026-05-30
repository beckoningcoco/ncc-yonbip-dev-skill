# |<<

**变更记录 (fa_logchangerecordview / nc.vo.fa.asset.LogChangeRecordViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2037.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_logchangerecord | 主键 | pk_logchangerecord | char(20) | √ | 主键 (UFID) |
| 2 | effective_period | 生效期间 | effective_period | char(19) |  | 日期 (UFDate) |
| 3 | change_period | 变更期间 | change_period | char(19) |  | 日期 (UFDate) |
| 4 | change_content | 变更内容 | change_content | varchar(400) |  | 字符串 (String) |
| 5 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |