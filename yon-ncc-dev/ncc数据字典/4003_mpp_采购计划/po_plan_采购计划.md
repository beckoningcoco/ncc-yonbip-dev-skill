# |<<

**采购计划 (po_plan / nc.vo.mpp.m2t.entity.PoPlanHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4613.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cplanhid | 采购计划 | cplanhid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 采购计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | vplancode | 采购计划编码 | vplancode | varchar(40) |  | 字符串 (String) |
| 5 | vplanname | 采购计划名称 | vplanname | varchar(60) |  | 字符串 (String) |
| 6 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 7 | dmakedate | 制单时间 | dmakedate | char(19) |  | 日期时间 (UFDateTime) |
| 8 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 9 | taudittime | 审批时间 | taudittime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | bpublish | 发布电子商务 | bpublish | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 12 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 13 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 14 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 19 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |