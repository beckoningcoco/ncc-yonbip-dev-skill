# |<<

**对账结果明细 (iufo_meetdata_body / nc.vo.hbbb.meetaccount.MeetResultBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3480.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | 明细主键 | pk_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_measure | 项目 | pk_measure | varchar(20) |  | 合并报表项目 (project) |
| 3 | direction | 方向 | direction | int |  | 科目方向 (Balanorient) |  | 0=借方; |