# |<<

**岗位设置 (po_position / nc.vo.pu.position.entity.PositionHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4616.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_position | 岗位设置 | pk_position | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 岗位编码 | code | varchar(30) |  | 字符串 (String) |
| 5 | name | 岗位名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | cemployeeid | 计划员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | vmemo | 备注 | vmemo | varchar(50) |  | 字符串 (String) |
| 8 | fpositiontype | 岗位类型 | fpositiontype | int |  | 整数 (Integer) |