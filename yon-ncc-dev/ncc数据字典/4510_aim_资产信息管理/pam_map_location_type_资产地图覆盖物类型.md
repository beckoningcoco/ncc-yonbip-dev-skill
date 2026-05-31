# |<<

**资产地图覆盖物类型 (pam_map_location_type / nc.vo.aim.equipmap.EquipMapTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4282.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_map_location_type | 资产地图覆盖物类型主键 | pk_map_location_type | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | type_name | 显示名称 | type_name | varchar(50) |  | 字符串 (String) |
| 4 | url | 图标地址 | url | varchar(50) |  | 字符串 (String) |
| 5 | css_style | 样式 | css_style | varchar(200) |  | 字符串 (String) |
| 6 | innercode | 内码 | innercode | varchar(200) |  | 字符串 (String) |
| 7 | shape | 类型 | shape | int |  | 整数 (Integer) |
| 8 | type_level | 显示级别 | type_level | int |  | 整数 (Integer) |