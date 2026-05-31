# |<<

**VMI汇总条件 (ic_vmi_condition / nc.vo.ic.m50.entity.VmiSumConditionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3004.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csumconditionid | 汇总条件主键 | csumconditionid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 公司 | pk_org | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | astuom | 结存单位 | astuom | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | lot | 批次号 | lot | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | freeitem | 辅助属性 | freeitem | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | billcode | 消耗单据号 | billcode | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | cmaterialvid | 物料版本 | cmaterialvid | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | dept | 用料部门 | dept | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | costobject | 成本对象 | costobject | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | workproc | 工序 | workproc | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | prdorder | 生产订单 | prdorder | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | consumebid | 消耗明细行 | consumebid | char(1) |  | 布尔类型 (UFBoolean) |