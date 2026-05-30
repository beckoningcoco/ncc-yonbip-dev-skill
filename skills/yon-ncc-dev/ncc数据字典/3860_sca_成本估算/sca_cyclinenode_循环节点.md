# |<<

**循环节点 (sca_cyclinenode / nc.vo.sca.stdcostlevel.CyclineNodeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5052.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccyclinenodeid | 循环节点 | ccyclinenodeid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 3 | ccosttypeid | 成本类型 | ccosttypeid | varchar(20) |  | 成本类型 (mapub_costtype) |
| 4 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | ccyclinepath | 循环路径 | ccyclinepath | varchar(50) |  | 字符串 (String) |
| 6 | ccyclineidpath | 循环主键路径 | ccyclineidpath | varchar(50) |  | 字符串 (String) |
| 7 | cnodeid | 节点主键 | cnodeid | char(20) |  | 主键 (UFID) |
| 8 | bisroot | 是否根节点 | bisroot | char(1) |  | 布尔类型 (UFBoolean) | N |
| 9 | nseq | 顺序 | nseq | int |  | 整数 (Integer) |