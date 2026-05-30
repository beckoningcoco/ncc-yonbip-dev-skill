# |<<

**循环节点 (cm_cyclinenode / nc.vo.cm.costlevel.entity.CyclineNodeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1466.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccyclinenodeid | 循环节点 | ccyclinenodeid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 3 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 4 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | cmarcostclassid | 成本分类 | cmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 6 | ccyclinepath | 循环路径 | ccyclinepath | varchar(700) |  | 字符串 (String) |
| 7 | bisroot | 是否根节点 | bisroot | char(1) |  | 布尔类型 (UFBoolean) | N |
| 8 | nseq | 顺序 | nseq | int |  | 整数 (Integer) |
| 9 | ccyclineidpath | 循环主键路径 | ccyclineidpath | varchar(50) |  | 字符串 (String) |
| 10 | fnodetype | 节点类型 | fnodetype | varchar(20) |  | 字符串 (String) |
| 11 | cnodeid | 节点主键 | cnodeid | char(20) |  | 主键 (UFID) |