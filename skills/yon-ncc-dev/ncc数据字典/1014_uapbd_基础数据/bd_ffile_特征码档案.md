# |<<

**特征码档案 (bd_ffile / nc.vo.bd.feature.ffile.entity.FFileHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/843.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cffileid | 特征码档案 | cffileid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | vskucode | 物料特征码 | vskucode | varchar(200) |  | 字符串 (String) |
| 6 | fdoctype | 类型 | fdoctype | int |  | 类型 (FFTypeEnum) |  | 1=标准; |