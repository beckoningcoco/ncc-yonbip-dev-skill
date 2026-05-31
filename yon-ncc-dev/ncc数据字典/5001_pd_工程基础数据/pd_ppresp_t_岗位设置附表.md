# |<<

**岗位设置附表 (pd_ppresp_t / nc.vo.pd.basedoc.ppresp.entity.PPRespTVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4368.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ppresp_t | 岗位设置附表主键 | pk_ppresp_t | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | marclasscode | 物料分类编码 | marclasscode | varchar(50) |  | 字符串 (String) |
| 6 | pk_marclass | 物料分类(末级分类) | pk_marclass | varchar(50) |  | 字符串 (String) |
| 7 | code | 岗位编码 | code | varchar(50) |  | 字符串 (String) |
| 8 | cemployeeid | 采购员 | cemployeeid | varchar(50) |  | 字符串 (String) |
| 9 | pk_ppresp_b | 岗位设置子表 | pk_ppresp_b | varchar(50) |  | 字符串 (String) |
| 10 | pk_ppresp | 岗位设置 | pk_ppresp | varchar(50) |  | 字符串 (String) |
| 11 | marclass | 物料分类 | marclass | varchar(50) |  | 字符串 (String) |
| 12 | innercode | 内部码 | innercode | varchar(50) |  | 字符串 (String) |