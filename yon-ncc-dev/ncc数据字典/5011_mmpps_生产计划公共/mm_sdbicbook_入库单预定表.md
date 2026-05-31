# |<<

**入库单预定表 (mm_sdbicbook / nc.vo.mmpps.lotreg.entity.SdbICBookVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3779.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ic | 主键 | pk_ic | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | cdemandkey | 需求主键 | cdemandkey | varchar(50) |  | 字符串 (String) |
| 4 | csupplykey | 入库主键 | csupplykey | varchar(50) |  | 字符串 (String) |
| 5 | nnum | 入库数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |