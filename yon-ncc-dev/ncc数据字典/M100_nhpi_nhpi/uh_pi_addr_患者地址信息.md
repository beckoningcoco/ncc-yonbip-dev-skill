# |<<

**患者地址信息 (uh_pi_addr / com.yonyou.yh.nhis.pi.pati.vo.PatiAddrVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6173.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_patiaddr | 患者地址主键 | pk_patiaddr | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_pati | 患者 | pk_pati | varchar(20) |  | 患者基本信息 (pati) |
| 5 | sortno | 序号 | sortno | int |  | 整数 (Integer) |
| 6 | pk_addrtype | 地址类型 | pk_addrtype | varchar(20) |  | 地址类别(自定义档案) (Defdoc-000014) |
| 7 | addr | 地址 | addr | varchar(256) |  | 字符串 (String) |
| 8 | pk_country | 国家 | pk_country | varchar(20) |  | 国家地区 (countryzone) |
| 9 | pk_region | 区域编码 | pk_region | varchar(20) |  | 行政区划(自定义档案) (Defdoc-010102) |
| 10 | postcode | 邮政编码 | postcode | varchar(50) |  | 字符串 (String) |
| 11 | pk_region_prov | 省(直辖市) | pk_region_prov | varchar(20) |  | 行政区划分(省/直辖市)(自定义档案) (Defdoc-010105) |
| 12 | pk_region_city | 市(地) | pk_region_city | varchar(20) |  | 行政区划分(市/地)(自定义档案) (Defdoc-010106) |
| 13 | pk_region_dist | 区(县) | pk_region_dist | varchar(20) |  | 行政区划分(区/县)(自定义档案) (Defdoc-010107) |
| 14 | name_st | 名称_街道乡镇 | name_st | varchar(50) |  | 字符串 (String) |
| 15 | teleno | 电话号码 | teleno | varchar(50) |  | 字符串 (String) |
| 16 | flag_use | 常用地址标志 | flag_use | char(1) |  | 布尔类型 (UFBoolean) |
| 17 | dt_addrtype | 地址类型编码 | dt_addrtype | varchar(50) |  | 字符串 (String) |
| 18 | dt_country | 国家编码 | dt_country | varchar(50) |  | 字符串 (String) |
| 19 | dt_region | 区域 | dt_region | varchar(50) |  | 字符串 (String) |
| 20 | dt_region_prov | 省(直辖市)编码 | dt_region_prov | varchar(50) |  | 字符串 (String) |
| 21 | dt_region_city | 市(地)编码 | dt_region_city | varchar(50) |  | 字符串 (String) |
| 22 | dt_region_dist | 区(县)编码 | dt_region_dist | varchar(50) |  | 字符串 (String) |
| 23 | dt_region_st | 街道/乡镇编码 | dt_region_st | varchar(50) |  | 字符串 (String) |