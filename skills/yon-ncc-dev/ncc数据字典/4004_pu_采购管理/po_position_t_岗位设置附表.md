# |<<

**岗位设置附表 (po_position_t / nc.vo.pu.position.entity.PositionTVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4618.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_position_t | 主键 | pk_position_t | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | marclasscode | 物料分类编码 | marclasscode | varchar(50) |  | 字符串 (String) |
| 5 | pk_marclass | 物料分类 | pk_marclass | varchar(20) |  | 字符串 (String) |
| 6 | code | 岗位编码 | code | varchar(50) |  | 字符串 (String) |
| 7 | cemployeeid | 采购员 | cemployeeid | varchar(20) |  | 字符串 (String) |
| 8 | pk_position_b | 岗位设置子表 | pk_position_b | varchar(20) |  | 字符串 (String) |
| 9 | pk_position | 岗位设置 | pk_position | varchar(20) |  | 字符串 (String) |
| 10 | fpositiontype | 岗位类型 | fpositiontype | int |  | 整数 (Integer) |