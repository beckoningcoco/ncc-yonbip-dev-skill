# |<<

**销售大屏维度变化 (so_dimension / nc.vo.so.dashboard.SODimensionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5404.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_so_dimension | 销售大屏维度变化主键 | pk_so_dimension | char(20) | √ | 主键 (UFID) |
| 2 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 3 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 4 | cdeptid | 部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 5 | cemployeeid | 业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 6 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | cchanneltypeid | 销售渠道类型 | cchanneltypeid | varchar(20) |  | 渠道类型 (channeltype) |
| 10 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |