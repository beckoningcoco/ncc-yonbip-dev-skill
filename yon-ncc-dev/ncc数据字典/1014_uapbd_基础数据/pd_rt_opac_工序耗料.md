# |<<

**工序耗料 (pd_rt_opac / nc.vo.bd.rt.rt0008.entity.RtOpacVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4379.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crt_opacid | 工序耗料 | crt_opacid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | vprocessno | 工序号 | vprocessno | varchar(10) |  | 字符串 (String) |
| 6 | iseqnumber | 序号数字 | iseqnumber | int |  | 整数 (Integer) |
| 7 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 9 | tbisfeature | 特征件 | tbisfeature | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | tcfeaturecode | 物料特征码 | tcfeaturecode | varchar(20) |  | 特征码档案 (bd_ffile) |
| 11 | cmeasureid | 主单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | cassmeasureid | 单位 | cassmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | nnumber | 主数量 | nnumber | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 16 | fsupplymode | 供应方式 | fsupplymode | int |  | 供应方式 (FsupplymodeEnum) | 1 | 1=一般发料; |