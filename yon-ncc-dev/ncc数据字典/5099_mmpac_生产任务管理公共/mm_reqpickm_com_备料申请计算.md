# |<<

**备料申请计算 (mm_reqpickm_com / nc.vo.mmpac.reqpickm.entity.ReqPickmComVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3764.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cid | 备料申计算ID | cid | varchar(50) | √ | 字符串 (String) |
| 2 | tab_pickm | 备料计划单 | tab_pickm | varchar(20) |  | 备料计划 (mm_pickm) |
| 3 | tab_mo | 生产订单 | tab_mo | varchar(20) |  | 流程生产订单明细 (mm_mo) |