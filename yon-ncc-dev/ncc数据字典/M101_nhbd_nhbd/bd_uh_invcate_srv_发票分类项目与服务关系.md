# |<<

**发票分类项目与服务关系 (bd_uh_invcate_srv / nc.vo.nhbd.nccinvcateitemsrv.NccInvcatesrvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1047.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invcatesrv | 子表主键 | pk_invcatesrv | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 5 | flag_cateitem | 分类或项目标志 | flag_cateitem | varchar(50) |  | 归属类别 (SrvContItemTypeEnum) |  | 0=服务分类; |