# |<<

**反向批次追溯 (mmpac_rbatchtrace / nc.vo.mmpac.batchass.rtrace.entity.RBatchTraceHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3809.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbatchtraceid | 批次追溯 | cbatchtraceid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | cdeliverorgvid | 发料库存组织 | cdeliverorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 4 | cdeliverorgid | 发料库存组织最新版本 | cdeliverorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | cmaterialid | 材料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 材料最新版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | vstockbatchcode | 库存批次号 | vstockbatchcode | varchar(40) |  | 字符串 (String) |
| 8 | vstockbatchcodeid | 库存批次号id | vstockbatchcodeid | char(20) |  | 主键 (UFID) |
| 9 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 10 | nbindnum | 关联主数量 | nbindnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | cserialcodeid | 序列号标识 | cserialcodeid | char(20) |  | 主键 (UFID) |
| 12 | vserialcode | 序列号 | vserialcode | varchar(40) |  | 字符串 (String) |