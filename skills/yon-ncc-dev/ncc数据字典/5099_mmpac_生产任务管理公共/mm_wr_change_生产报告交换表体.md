# |<<

**生产报告交换表体 (mm_wr_change / nc.vo.mmpac.wr.entity.WrChangeItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3797.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wr_change | 生产报告单据转换 | pk_wr_change | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cbmainmaterialid | 主产品 | cbmainmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cbmainmaterialvid | 主产品版本 | cbmainmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | vbbatchid | 生产批次号id | vbbatchid | varchar(50) |  | 字符串 (String) |
| 8 | vbinbatchid | 库存批次id | vbinbatchid | varchar(50) |  | 字符串 (String) |
| 9 | tproductts | 产出表ts | tproductts | char(19) |  | 日期时间 (UFDateTime) |
| 10 | vginstockbid | 质量信息库存批次id | vginstockbid | varchar(50) |  | 字符串 (String) |
| 11 | vpbatchcodeid | 批次号主键 | vpbatchcodeid | varchar(50) |  | 字符串 (String) |