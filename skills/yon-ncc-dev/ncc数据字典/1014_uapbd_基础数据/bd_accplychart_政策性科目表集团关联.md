# |<<

**政策性科目表集团关联 (bd_accplychart / nc.vo.bd.accchart.AccPlyChartVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/318.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accpolicychart | 主键 | pk_accpolicychart | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | dataoriginflag | 数据来源 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |