# |<<

**对账数据明细表 (ufoc_meetdatasub / nc.vo.hbbb.meetdata.MeetdatasubVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5885.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meetdatasub | 对账明细表标识 | pk_meetdatasub | char(20) | √ | 主键 (UFID) |
| 2 | pk_meetdata | 对账数据表标识 | pk_meetdata | varchar(20) |  | 对帐数据表 (MeetdataVO) |
| 3 | pk_measure | 项目 | pk_measure | varchar(20) |  | 合并报表项目 (project) |
| 4 | amount | 金额值 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | direction | 方向 | direction | int |  | 科目方向 (Balanorient) |  | 0=借方; |