# |<<

**实际成本计算错误报告 (scaba_levelcalcheckreport / nc.vo.scaba.cmlevel.entity.CmLevelCalCheckReport)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5087.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_checkreport | 错误报告ID | pk_checkreport | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org_co | 业务单元 | pk_org_co | varchar(20) |  | 组织 (org) |
| 4 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 5 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_accbook | 核算账簿 | pk_accbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 7 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 8 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 9 | ccostcomponentid | 成本组件 | ccostcomponentid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 10 | vmocode | 订单 | vmocode | varchar(20) |  | 字符串 (String) |
| 11 | cmaterialid | 产品 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | description | 说明 | description | varchar(50) |  | 字符串 (String) |
| 13 | checkitem | 检查项 | checkitem | varchar(50) |  | 错误检查项 (CheckItemEnum) |  | 1=未取到标准价; |